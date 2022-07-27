package com.tj.designpatterns.chofresb;

import com.tj.designpatterns.chofresb.model.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author nitianyi
 * @date 2021/2/5
 */
@Primary
@Order(1)
@Component
public class AdCheckHandler extends AbstractHandler {

    private static final Logger log = LoggerFactory.getLogger(AdCheckHandler.class);

    @Override
    protected boolean condition(Article article) {
        return true;
    }

    @Override
    protected void doHandle(Article article) {
        log.info("ad check working, article: {}", article);
    }
}
