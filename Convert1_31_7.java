package Convarters;

//import java.awt.geom.RoundRectangle2D.Double;

public class Convert1 {
	public Convert1(){
		String srt = "1032";
		Integer a = Integer.parseInt(srt);
		System.out.println("string to integer :-"+(a+1));
     	System.out.println("value is :-"+(srt+1));
	}
	public static void main(String[] args){
		//(string to integer converter)
		Convert1 cnt = new Convert1();
		
     	
     	
	    //(integer to string)
	    int ab = 5;
	    String srt2 = " " +ab+1;
	    System.out.println("integer to string :-"+srt2);
	    
	    //(double to int)
	    double x = 10.43;
	    int y =(int) x;
	    System.out.println("double to integer :-"+y);
	    
	    //(int to double)
	    int pq = 10;
	    double st = pq;
	    System.out.println("integer to double...>"+st);
	    
	    //(string to long convert)
	    String tp = "1001";
	    long l = Long.parseLong(tp);
	    System.out.println("string to long  :-" +(l+1));
	    
	    //(long to string)
	    long ld = 100;
	    String str = String.valueOf(ld);
	    System.out.println("long to string :-"+str);
	    
	    //(string to double convert)
	    String std = "8574.54";
	    double value = Double.parseDouble(std);
	    System.out.println("string to double convert :-"+value);
	    
	    //(double to string converstion)
	    double adt =10.34;
	    String astng = Double.toString(adt);
	    System.out.println("double to string values...>"+(astng+1));
	    
	    //(array string )
	    char[] mychr = new char[]{'a','d','s','f','e','s','w','r','g'};
	    System.out.println(mychr);
	    String outer = new String(mychr);
	    System.out.println("outer :-"+outer);
	    String outer2 = String.valueOf(mychr);
	    System.out.println("outer2--->"+outer2);
	    
	    
	    
	    //(convert int array to string array)
	    int[] number = {1,2,3,4,5,6};
	    
	}

}
