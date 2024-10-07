package Telusukoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.*;

public  class ComparatorDemo {
    public static void main(String[] args)
    {
        Comparator<Student> std=(i,j)-> (i.age > j.age) ? 1 : -1;

        List<Student> studs=new ArrayList<>();
        studs.add(new Student(12,"sai"));
        studs.add(new Student(18,"dasari"));
        studs.add(new Student(10,"chinni"));
        studs.add(new Student(24,"bye bye"));

        System.out.println(studs);
        Collections.sort(studs,std);
        for(Student s:studs)
        {
            System.out.println(s);
        }

    }
}


class Student implements Comparable<Student>
{
    int age;
    String name;

    public String toString()
    {
        return "Student [age= " + age +",name= "+name+"]";
    }
    public Student(int age , String name )
    {
        this.name =name ;
        this.age =age;
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return  1 ;
        else return -1;
    }
}