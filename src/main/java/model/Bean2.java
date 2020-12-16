package model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

public class Bean2 implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("interface init method " + beanName);
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        System.out.println("set beanName " + beanName);
        this.beanName = beanName;
    }

    private String beanName;
}
