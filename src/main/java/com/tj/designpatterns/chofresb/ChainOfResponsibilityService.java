package com.tj.designpatterns.chofresb;

import com.tj.designpatterns.chofresb.model.HandlerRequest;
import com.tj.designpatterns.chofresb.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nitianyi
 * @date 2021/2/5
 */
@Service
public class ChainOfResponsibilityService {

    @Autowired
    private AbstractHandler abstractHandler;

    public void execute() {
        abstractHandler.handleRequest(new HandlerRequest(UserRole.GUEST));
        abstractHandler.handleRequest(new HandlerRequest(UserRole.CUSTOMER));
        abstractHandler.handleRequest(new HandlerRequest(UserRole.MERCHANT));
    }
}
