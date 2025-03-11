package com.exam.spring02;

import exam.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextExam {
    public static void main(String[] args) {
        // 인스턴스를 인터페이스 타입으로 참조할 수 있다.
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // ClassPathXmlApplicationContext는 CLASSPATH에서 xml 설절파일을 읽어들여 동작한다.
        // Book book1 = (Book)context.getBean("book1");
        Book book1 = context.getBean("book1", Book.class);
        book1.setTitle("즐거운 Spring Boot");
        book1.setPrice(5000);

        System.out.println(book1.getTitle());
        System.out.println(book1.getPrice());

        Book book2 = (Book)context.getBean("book1"); // Bean id가 같아 같은 인스턴스가 생성됨
        System.out.println(book2.getTitle());

        Book book3 = (Book)context.getBean("book2"); // Bean id가 달라 다른 인스턴스가 생성됨
        System.out.println(book3.getTitle());


    }
}
