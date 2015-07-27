package pack1;

import pack2.Class3;

//import pack2.Class3;

public class Class2 {
   int x=1;
   public int y=2;
   protected int z=3;
   private int p=10;
   
   int returnx(){
	   return x;
   }
    public int returny(){
    	y = x*z;
    	return y;
    }
    protected int returnz(){
    	z=y*p;
    	return z;
    }
    private int returnp() {
    
		return p;
	}
    public static void main(String[] arg){
    	Class2 cls2 = new Class2();
    	
    	System.out.println("returnz....> "+cls2.returnz());
    	System.out.println("returnp ....> "+cls2.p);
    	System.out.println("return....>"+cls2.z);
    	B b = new B();
    	System.out.println("returnz-----> "+b.returnz());
        b.hello();
    	//System.out.println( b.hello());
    }
     
}
class B extends Class2{
	public static void hello (){
		System.out.println("hello");
		Class2 cls3 = new Class2();
		System.out.println(cls3.returnx());
		System.out.println(cls3.returnz());
		
	}
}
