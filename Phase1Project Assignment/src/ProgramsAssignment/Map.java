package ProgramsAssignment;
import java.util.*;
import java.util.Map.Entry;
public class Map {

	public static void main(String[] args) {
	//Hashmap
	HashMap<Integer,String> hm=new HashMap<Integer,String>();      
      hm.put(011,"Than");    
      hm.put(22,"Moni");    
      hm.put(39,"ram");   
       
      System.out.println("\nThe elements of Hashmap are ");  
      for(Entry<Integer, String> m:hm.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }
      
     //HashTable
       
      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
      
      ht.put(18,"Allu");  
      ht.put(17,"Ramu");  
      ht.put(16,"Jaava");  
      ht.put(33,"mini");  

      System.out.println("\nThe elements of HashTable are ");  
      for(Entry<Integer, String> n:ht.entrySet()){    
       System.out.println(n.getKey()+" "+n.getValue());    
      }
      
      
      //TreeMap
      
      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(59,"kavya");    
      map.put(76,"Chethan");    
      map.put(25,"Chiru");       
      
      System.out.println("\nThe elements of TreeMap are ");  
      for(Entry<Integer, String> l:map.entrySet()){    
       System.out.println(l.getKey()+" "+l.getValue());    
      }    
      
   }  
}

