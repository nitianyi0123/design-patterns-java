package com.tj.designpatterns.chofresb;

import com.tj.designpatterns.chofresb.model.Article;
import com.tj.designpatterns.chofresb.model.Subject;
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
        abstractHandler.handle(new Article(Subject.Chinese, "莲出淤泥而不染，濯清涟而不妖。"));
        abstractHandler.handle(new Article(Subject.Math, "1+1=2"));
        abstractHandler.handle(new Article(Subject.English, "Hello World"));
    }
}
