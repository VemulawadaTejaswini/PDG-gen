import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<Integer>ans  = new ArrayList<>();
    
    int cou = 0;
    for(int i=a; i<=a+(k-1); i++) {
    	if(i <= b) {
    	if(!ans.contains(i)){		
    	      ans.add(i);
    	      cou++;
    	}
    }
    }
    for(int i=b; i>=b-(k-1); i--) {
    	if(i>=a) {
    	if(!ans.contains(i)){		
  	      ans.add(i);
  	      cou++;
    	}
  }
    }
    Collections.sort(ans);
    for(int i=0; i<cou; i++) {
    System.out.println(ans.get(i));
    		}
}
}