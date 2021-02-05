package com.tj.designpatterns.chofresb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author nitianyi
 * @date 2021/2/5
 */
@SpringBootTest
class ChainOfResponsibilityServiceTest {

    @Autowired
    private ChainOfResponsibilityService chainOfResponsibilityService;

    @Test
    void execute() {
        chainOfResponsibilityService.execute();
    }
}