package Assignement4;

import java.util.*; 

class Reverse {
    public static void main(String[] args)
    {
        List<String> course = new ArrayList<>(
            Arrays.asList("Java", "Selenium", "TestNG", "Git", "Github"));
       
        System.out.println("Reverse order of given List :- ");
 
 
        for (int k = 0, j = course.size() - 1; k < j; k++)
        {
            course.add(k, course.remove(j));
        }
 
        System.out.println(course);
    }
}
