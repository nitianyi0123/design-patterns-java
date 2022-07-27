package com.tj.designpatterns.chofresb;

import com.tj.designpatterns.chofresb.model.Article;
import com.tj.designpatterns.chofresb.model.Subject;
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
public class PolicyCheckHandler extends AbstractHandler {

    private static final Logger log = LoggerFactory.getLogger(PolicyCheckHandler.class);

    @Override
    protected boolean condition(Article article) {
        return article.getSubject() != Subject.Math;
    }

    @Override
    protected void doHandle(Article article) {
        article.getTags().add(article.getContent().split("\\s")[0]);
        log.info("policy check working, article: {}", article);
    }
}
