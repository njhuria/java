package hashmapex;

import java.util.HashMap;
import java.util.Map;

public class Mapinmap {
	public static void main(String str[]){
		HashMap<String, String> mymap = new HashMap<String, String>();
		mymap.put("k1", "v1");
		System.out.println(mymap);
		
		HashMap<Map<String , String> , String> mymap2= new HashMap<Map<String ,String> , String>();
		mymap2.put(mymap, "v2");
		System.out.println(mymap2);
		mymap.put("k2", "v6");
		mymap2.put(mymap, "v2");
		System.out.println(mymap2);
		
		Map<String ,String> mp = new HashMap<String ,String>();
		Map<String ,String> pm = new HashMap<String ,String>();
		mp.put("name", "sr");
		pm.put("name2", "sr2");
		mymap2.put(mp, "srrr");
		mymap2.put(pm, "value");
		System.out.println(mymap2);
		
		
		
		
		
	
		
		HashMap<Map<Map<String ,String> ,String>,String> mymap3 = new HashMap<Map<Map<String ,String> ,String>,String>();
		mymap2.put(mymap, "v5");
		System.out.println(mymap3);
		mymap3.put(mymap2, "v3");
		
		System.out.println(mymap3);
		
		
		HashMap<String , String> test = new HashMap<String , String>();
		test.put("k1","V1");
		System.out.println(test);
		HashMap<String , String> test2 = new HashMap<String , String>();
		test2.put("k2", "v1");
        System.out.println(test2);
		
		HashMap<String , Map<String ,String>> mytst = new HashMap<String , Map<String ,String>>();
		
		mytst.put("k3", test2);
		System.out.println(mytst);
		
		
	}

}
