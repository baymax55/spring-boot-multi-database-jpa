package com.baymax.springbootmultidatasourcejpa.repository.second;

import com.baymax.springbootmultidatasourcejpa.entity.second.SecondApp;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bx
 * @date 8/30/2019 11:18 AM
 */
public interface AppSecondRepository extends JpaRepository<SecondApp,String> {
}
