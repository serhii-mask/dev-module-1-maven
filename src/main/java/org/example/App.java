package org.example;

import org.example.person.Person;

public class App
{
    public static void main( String[] args )
    {
        Person person = new Person();
        person.setName("Ivan");
        person.setAge(32);
        System.out.println("person = " + person);
    }
}
