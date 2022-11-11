package Assignement4;
import java.util.*;

public class List2 {

	public static void main(String[] args) {
		
		//Git, Github, GitLab,GitBash, Selenium, Java, Maven

List <String> list=Arrays.asList("Git","Github","GitLab","GitBash","Selenium","Java","Maven");
List<String> list1=new ArrayList<>();// creating new list
// traversing list  for comparing and if found add to list1

for(int i=0;i<list.size();i++)
{
	//storing list element in String 
	String s1=list.get(i);
  //comparing if it starts with "Git"     
if(s1.startsWith("Git"))
{
	list1.add(s1);
}
}
// printing if it contains "Git"
System.out.println(list1);
                                                                      



	}}
