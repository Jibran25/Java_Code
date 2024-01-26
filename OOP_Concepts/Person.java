import java.util.*;
class Person {

    String name;
    String age;

    public void myfunc(){

        System.out.println("this is my function \n");
        System.out.println(this.name);

    }

}

class ClassObj{
    public static void main(String args[])
    {
        System.out.println("hello");
        Person prson = new Person(); 
        prson.name=("jibran");
        prson.myfunc();
    }
}