package testproject;

import java.awt.List;
import java.util.ArrayList;

public class Foreach_24_7 {
	public static void main(String[] args){
		int i,j;
		System.out.println("foreach example");
		int arry[] ={1,4,32,5,4,6};
	     for(int x : arry){
	    	 System.out.println(x);
	     }
	     System.out.println("example 2");
	     int arrys[][] = new int[2][2];
	     for( i=0;i<arrys.length;i++){
	    	 for( j=0;j<arrys.length;j++){
	    		 
	    	// System.out.println(i+"......"+j);
	    	 arrys[i][j]= i+j;
	    	 System.out.println(arrys[i][j]);
	    	 }
	    	
	     }
	     for(int[] val : arrys){
	    	 //System.out.println(val);
	    	 for(int x : val){
	    		 System.out.println("foreach arry ..."+x);
	    	 }
	     }
	     System.out.println("Example 3");
	    ArrayList<String> mylist = new ArrayList<String>();
	    mylist.add("A");
	    mylist.add("B");
	    mylist.add("c");
	    
	 for(String str : mylist){
	    	//System.out.println(mylist);
	    	System.out.println(str);
	    } 
	     
	}

}
