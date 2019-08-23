package com.github.vincentrussell;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.StandardEnvironment;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // loading the definitions from the given XML file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        StandardEnvironment standardEnvironment = new StandardEnvironment();
        standardEnvironment.setActiveProfiles("dev");
        context.setEnvironment(standardEnvironment);
        context.setConfigLocation("classpath:context.xml");
        context.refresh();

        BaseBean baseBean = context.getBean(BaseBean.class);
        System.out.println(String.format("greeting:%s", baseBean.getGreeting()));
    }
}
