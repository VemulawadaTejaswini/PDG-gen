import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
		    str[i] = new String();
		    str[i] = sc.next();
		}
		sc.close();
      
		for(String i: str) 
		    hm.put(i, (hm.get(i)==null)?1:hm.get(i)+1);
		
		int x=(Collections.max(hm.values())); 
        for (Map.Entry<String, Integer> ent : hm.entrySet()) 
            if (ent.getValue()==x)
                System.out.println(ent.getKey());                 
	}
}