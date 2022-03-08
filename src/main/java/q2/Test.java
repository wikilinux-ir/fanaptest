package q2;

import java.util.HashMap;
import java.util.Map;
public class Test {
	
    static class A {
    	
    	private static Map<Integer, A> map = new HashMap<Integer, A>();
        private int id = 0;
        private A(int id) {
            this.id = id;
        }
       
        public static A getInstance(int id) {

        		if (map.containsKey(id)) {
					
        			return map.get(id);
				}
        	map.put(id, new A(id));
        	return map.get(id);
        
        }
        
    }

    public static void main(String[] args) {
        A a1 = A.getInstance(1);
        A a2 = A.getInstance(2);
        A a3 = A.getInstance(1);
        Map<A, String> mp = new HashMap<A, String>();
        mp.put(a1, "hassan");
        mp.put(a2, "karim");
        mp.put(a3, "ali"); 
        
     
        System.out.println(mp.get(a1));
    }
}