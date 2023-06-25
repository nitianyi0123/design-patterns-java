package com.tj.designpatterns.cor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import java.util.List;

/**
 * @author nitianyi
 * @date 2021/2/5
 */
@Configuration
public class InitConfigHandler implements InitializingBean {

    @Autowired
    private List<AbstractHandler> abstractHandlerList;

    @Override
    public void afterPropertiesSet() throws Exception {
        abstractHandlerList.sort(AnnotationAwareOrderComparator.INSTANCE);

        int size = abstractHandlerList.size();

        for (int i = 0; i < size - 1; i++) {
            abstractHandlerList.get(i).setNext(abstractHandlerList.get(i + 1));
        }

    }
}
