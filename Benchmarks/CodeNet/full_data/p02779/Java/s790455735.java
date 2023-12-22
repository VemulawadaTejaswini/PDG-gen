import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] array = new String[n];
        for (int i = 0; i < n; i++) {
        	array[i] = sc.next();
        }
		int bf = 0;
		bf = array.length;;
		int af = 0;
		Set<String> linkedHashSet = new LinkedHashSet<String>();
	    for (int i = 0; i < array.length; i++) {
	        linkedHashSet.add(array[i]);
	        }

	    Object[] strings_after = linkedHashSet.toArray();
	    af = strings_after.length;

	    if(af == bf){
	    	System.out.println("YES");
	    }else{
	    	System.out.println("NO");
	    }
		}
}