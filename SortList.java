import java.util.*;  
import java.util.stream.*;  
public class SortList 
{  
public static void main(String[] args)   
{  
//returns a list view   
List<String> slist = Arrays.asList("Masudha", "Swapnil", "Vivaan", "Ashmita", "Bunty", "Amit");  
List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
sortedList.forEach(System.out::println);  
}  
}  
