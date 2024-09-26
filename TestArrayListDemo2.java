package org.example;

import java.util.ArrayList;
import java.util.Iterator;
public class TestArrayListDemo2 {

    public static <Emp> void main(String[] args) {

        ArrayList<Emp> empList = new ArrayList<Emp>(10);

        Emp emp1 = new Emp(1032545, "Vaishali", 500.0F);
        Emp emp2 = new Emp(102, "Mike", 15000);
        Emp emp3 = new Emp(1032545, "Vaishali", 500.0F);
        Emp emp4 = new Emp(104, "Tom", 14000);
        Emp emp5 = new Emp(9878, "Sushma", 800);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println("Size of empList: " + empList.size());
        System.out.println( "empList: " + empList);
        Iterator<Emp> iterator = empList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(" - "+iterator.next());
        }

        System.out.println("Fetch specigif=c entry from the list");
        Emp emp = empList.get(2);
        System.out.println(emp);

        System.out.println("--Delete specific entry from the list- using index--------");
        empList.remove(2);
        System.out.println("Size of empList  after delet: " + empList.size());
        System.out.println( " after delete empList: " + empList);

        System.out.println("--Delete specific entry from the list- using Object--------");
        empList.remove(emp4);
        System.out.println("Size of empList  after delete object: " + empList.size());
        System.out.println( " after delete  emp4 empList: " + empList);




    }
}
