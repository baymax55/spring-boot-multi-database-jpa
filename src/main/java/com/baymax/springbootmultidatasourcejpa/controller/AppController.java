package com.baymax.springbootmultidatasourcejpa.controller;

import com.baymax.springbootmultidatasourcejpa.repository.primary.AppRepository;
import com.baymax.springbootmultidatasourcejpa.repository.second.AppSecondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bx
 * @date 8/30/2019 11:20 AM
 */
@RestController
@RequestMapping("/")
public class AppController {

    @Autowired
    AppRepository appPrimaryRepository;

    @Autowired
    AppSecondRepository appSecondRepository;
    @GetMapping("primary")
    private  String getPrimaryApp(){
        return appPrimaryRepository.findById("1").toString();
    }
    @GetMapping("second")
    private  String getSecondApp(){
        return appSecondRepository.findById("2").toString();
    }
}
