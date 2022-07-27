package com.tj.designpatterns.chofresb.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nitianyi
 * @date 2021/2/5
 */
public class Article {

    private final Subject subject;
    private final String content;
    private final List<String> tags;

    public Article(Subject subject, String content) {
        this.subject = subject;
        this.content = content;
        this.tags = new ArrayList<>();
    }

    public Subject getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Article{" +
                "subject=" + subject +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                '}';
    }
}
