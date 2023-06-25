package com.tj.designpatterns.cor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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