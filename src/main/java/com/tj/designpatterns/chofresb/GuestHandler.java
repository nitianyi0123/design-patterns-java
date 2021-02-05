package com.tj.designpatterns.chofresb;

import com.tj.designpatterns.chofresb.model.HandlerRequest;
import com.tj.designpatterns.chofresb.model.UserRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author nitianyi
 * @date 2021/2/5
 */
@Order(3)
@Component
public class GuestHandler extends AbstractHandler {

    private static final Logger log = LoggerFactory.getLogger(GuestHandler.class);

    @Override
    protected boolean isHit(HandlerRequest request) {
        return request.getUserRole() == UserRole.GUEST;
    }

    @Override
    protected void handle(HandlerRequest request) {
        log.info("handle guest execute, request: {}", request);
    }
}
