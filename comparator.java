import java.util.*;
 
public class Main {
  
  public static void main(String[] args) {
  
    ArrayList list = new ArrayList();
    list.add("Yash");
    list.add("Harsh");
    list.add("Akshay");
    list.add("Tony");
    list.add("Prafful");
    System.out.println("Elements in ArrayList prior sorting :");
    for(int i=0; i < list.size(); i++)
 
System.out.println(list.get(i));
    Comparator comparator = Collections.reverseOrder();
  
    Collections.sort(list,comparator);
 
    System.out.println("Elements in ArrayList after sorting :");
    for(int i=0; i < list.size(); i++)
 
System.out.println(list.get(i));
  
  }
}
