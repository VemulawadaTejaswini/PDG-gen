import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int[]a = new int[3];
    ArrayList<Integer>ans  = new ArrayList<>();
    
    for(int i=0; i<3; i++) {
        a[i] = sc.nextInt();
    	if(!ans.contains(a[i])){		
    	      ans.add(a[i]);
    		}
    }
    	System.out.println(ans.size());
    		}
}