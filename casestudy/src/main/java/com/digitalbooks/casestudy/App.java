package com.digitalbooks.casestudy;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/digitalbooks/casestudy/bookConfig.xml");
        Book book1 = (Book) context.getBean("book1");
        System.out.println(book1.getAuthor());
        System.out.println(book1.getCategory());
        System.out.println(book1.getChapters_content());
        System.out.println(book1.getLogo());
        System.out.println(book1.getPrice());
        System.out.println(book1.getPublisher());
        System.out.println(book1.getTitle());
        System.out.println(book1.getDate());
     
    }
}
