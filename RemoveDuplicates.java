package Assignement4;


import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		// adding elements to list
		
		list.add("Java");
		list.add("TestNG");
		list.add("Maven");
		list.add("Java");
		
		// creating new list
		List<String> list1=new ArrayList<>();
		//traversing and checking for the duplicate element 
		for(int i=0;i<list.size();i++)
		{
			 if (!list1.contains(list.get(i))) {
				  
	                list1.add(list.get(i));
	            }
		}
		// printing the element after removing duplicate 
		System.out.println(list1);
		
		
		

	}

}
