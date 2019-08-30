package com.baymax.springbootmultidatasourcejpa;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Snowflake;
import com.baymax.springbootmultidatasourcejpa.entity.primary.PrimaryApp;
import com.baymax.springbootmultidatasourcejpa.entity.second.SecondApp;
import com.baymax.springbootmultidatasourcejpa.repository.primary.AppRepository;
import com.baymax.springbootmultidatasourcejpa.repository.second.AppSecondRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ApplicationTests {
    @Autowired
    AppRepository primaryRepo;

    @Autowired
    AppSecondRepository secondRepo;

    @Autowired
    private Snowflake snowflake;

    @Test
    public void contextLoads() {
        PrimaryApp app1=new PrimaryApp(snowflake.nextId(),"测试1");
        primaryRepo.save(app1);

        SecondApp secondApp = new SecondApp(snowflake.nextId(),"测试2");
//        BeanUtil.copyProperties(app1, secondApp);
        secondRepo.save(secondApp);
    }
    @Test
    public void testUpdate() {
        primaryRepo.findAll().forEach(primary -> {
            primary.setName("修改后的"+primary.getName());
            primaryRepo.save(primary);

            SecondApp second = new SecondApp();
            BeanUtil.copyProperties(primary, second);
            secondRepo.save(second);
        });
    }

    @Test
    public void testDelete() {
        primaryRepo.deleteAll();

        secondRepo.deleteAll();
    }

    @Test
    public void testSelect() {
        List<PrimaryApp> primary = primaryRepo.findAll();
        log.info("【primary】= {}", primary);

        List<SecondApp> second = secondRepo.findAll();
        log.info("【second】= {}", second);
    }


}
