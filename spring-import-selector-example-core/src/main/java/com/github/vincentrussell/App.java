package com.github.vincentrussell;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // loading the definitions from the given XML file
        ApplicationContext context = new ClassPathXmlApplicationContext(
            "classpath:context.xml");


        BaseBean baseBean = context.getBean(BaseBean.class);
        System.out.println(String.format("greeting:%s", baseBean.getGreeting()));
    }
}
