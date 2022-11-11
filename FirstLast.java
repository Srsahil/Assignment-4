package Assignement4;

import java.util.*;

public class FirstLast {

	public static void main(String[] args) {
	/*

Create a list of values and print the second element, second last element.
Input – 10,45, 90,45, 23, 90, 44
Output – 45,90



*/
		List<Integer> list= Arrays.asList(10,45,90,45,23,90,44); 
		// printing the second element from the list
		System.out.println("second element of the list is -> "+list.get(1));
		// printing the second last element as list.size()-2-> give index of second last element 
		System.out.println("second element of the list is -> "+ list.get(list.size()-2));
		
		
		
	}

}
