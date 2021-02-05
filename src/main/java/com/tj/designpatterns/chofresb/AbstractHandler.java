package com.tj.designpatterns.chofresb;

import com.tj.designpatterns.chofresb.model.HandlerRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nitianyi
 * @date 2021/2/5
 */
public abstract class AbstractHandler {

    private static final Logger log = LoggerFactory.getLogger(AbstractHandler.class);

    private AbstractHandler next;

    public AbstractHandler getNext() {
        return next;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public void handleRequest(HandlerRequest request) {
        if (isHit(request)) {
            this.handle(request);
            return;
        }
        if (this.next != null) {
            this.next.handleRequest(request);
        } else {
            log.warn("no handler execute, request: {}", request);
        }
    }

    protected abstract boolean isHit(HandlerRequest request);

    protected abstract void handle(HandlerRequest request);

}
