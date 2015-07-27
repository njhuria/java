package jasonobject;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class EncodejsonObject {
	public static void main(String[] args) throws IOException{
		Map mymap = new HashMap();
		mymap.put("name",new Integer(300));
		mymap.put("name2",new Boolean(true));
		mymap.put("name3", new Integer(30));
		
		JSONObject ob = new JSONObject();
		ob.put("name4",new Integer(3002));
		ob.put("name6",new Boolean(true));
		ob.put("name71", new Integer(3430));
		
		JSONObject ob1 = new JSONObject();
		ob1.put("name4",new Integer(302));
		ob1.put("name6",new Boolean(true));
		ob1.put("name7", new Integer(330));
		ob1.put(ob,"name");
		System.out.println("....\n"+ob1);
		
		System.out.println("\n");
		//ob1.putAll(ob);
		//System.out.println(ob1);
		
		JSONArray list2 = new JSONArray();
		list2.add("foo");
		list2.add(new Integer(345));
		
		list2.add(ob1);
		System.out.println(list2);
		
		LinkedList list = new LinkedList();
		//LinkedList list = new LinkedList();
		list.add(mymap);
		list.add(ob);
		list.add(ob1);
		
		
		String str = JSONValue.toJSONString(list);
		System.out.println(str);
	}

}
