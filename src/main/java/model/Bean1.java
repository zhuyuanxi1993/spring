package model;


public class Bean1 {
    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    private void init(){
        System.out.println("bean1 init");
    }
    private String beanName;
}
