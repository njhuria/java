package hashmapex;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashset {
           public static void main(String[] s){
        	   Set set = new HashSet();
        	   set.add("A");
        	   set.add("B");
        	   set.add("C");
        	   set.add("D");
        	   set.add("A");
        	   
        	   ArrayList<String> list = new ArrayList<String>();

        	   list.add("f");
        	   list.add("g");
        	   list.add("i");
        	   list.add("i");
        	   list.add("j");
        	   System.out.println("myset is" +set);

        	   Set set2 = new HashSet(list);
        	   set2.remove("i");
        	   
        	   System.out.println("my list is"+list);
        	   System.out.println("my set2 is"+set2);
        	   System.out.println("my set1 & set2 equal?"+set.equals(set2));
        	   
     for(Object str : set2){
    	 System.out.println("my for loop :"+str);
    	 
     }
     Object[] array = set2.toArray(new String[set2.size()]);
             System.out.println("The array:" + Arrays.toString(array));

        			   
        	   
        	   
        	   HashMap mymap = new HashMap();
        	   mymap.put(set, list);
        	   System.out.println("My map is"+mymap);
        	   
        	   
        	   HashSet<String> hs = new HashSet<String>();
        	   hs.add("kl");
        	   hs.add("ss");
        	   hs.add("das");
        	   hs.addAll(set);
        	  //Iterator<String> itr = hs.iterator();
        	  //while(itr.hasNext()){
              //System.out.println(itr.next());
        	   System.out.println(hs);
        	   
        	   
      
           }
          
}
