package com.tj.designpatterns.chofresb;

import com.tj.designpatterns.chofresb.model.Article;

/**
 * @author nitianyi
 * @date 2021/2/5
 */
public abstract class AbstractHandler {

    private AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public void handle(Article article) {
        if (condition(article)) {
            this.doHandle(article);
        }
        if (this.next != null) {
            this.next.handle(article);
        }
    }

    protected abstract boolean condition(Article article);

    protected abstract void doHandle(Article article);

}
