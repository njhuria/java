package testproject;

public class test2_23_7 {
	String str;
	test2_23_7(){
		System.out.println("constructor call");
	}
	test2_23_7(String t){
		str = t;
		System.out.println("2nd constructor call" +str);
	}
	public static void main(String[] str){
		test2_23_7 lang = new test2_23_7();
		test2_23_7 lang2 = new test2_23_7("30");
		lang2.getName();
		lang.setName("C++");
		lang2.getName();
		lang.setName("20");
	}
	void setName(String t){
		str = t;
		System.out.println("set method call :"+str);
	}
	void getName(){
		System.out.println("get method call :" +str);
	}

}
