import model.Bean1;
import model.Bean2;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.io.ClassPathResource;

public class Boot {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2)applicationContext.getBean("Bean2");
        System.out.println(bean2.getBeanName());
//        Bean1 bean1 = (Bean1)applicationContext.getBean("Bean1");
//        System.out.println(bean1.getBeanName());
//        bean1.setBeanName("bean1NameChange");
//        System.out.println(bean1.getBeanName());
//        Bean1 bean2 = (Bean1)applicationContext.getBean("Bean1");
//        System.out.println(bean2.getBeanName());
//        System.out.println(((Bean1)factory.getBean("Bean1")).getBeanName());
        applicationContext.registerShutdownHook();
    }
}
