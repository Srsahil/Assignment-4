package Assignement4;
import java.util.*;

public class AddingLists {

	public static void main(String[] args) {
		
		/* 
		 * Create a list which can accept another list as an element.
           List 1- 11,22,33
	    List 2-  9,19,29	
	    List 3-  7,17,27
  	Hint - ArrayList<ArrayList<Integer>> l1=new ArrayList<>(); 
		 
		 * 
		 * */
	
		
		//creating the parent list with giving number as 3 for 3 different list
		ArrayList<ArrayList<Integer> > list = 
                new ArrayList<ArrayList<Integer> >(3);

      //creating list1 and adding element to it
      ArrayList<Integer> l1 = new ArrayList<Integer>();
      l1.add(11);
      l1.add(22);
      l1.add(33);
      // adding list to parent list
      list.add(l1);
      //creating list2 and adding element to it
      ArrayList<Integer> l2 = new ArrayList<Integer>();
      
      l2.add(9);
      l2.add(19);
      l2.add(29);
      // adding list to parent list
      list.add(l2);
      //creating list3 and adding element to it
      
 ArrayList<Integer> l3 = new ArrayList<Integer>();
      
      l3.add(7);
      l3.add(17);
      l3.add(27);
      // adding list to parent list
      list.add(l3);
      
      // printing whole list
      
      System.out.println(list);


	}

}
