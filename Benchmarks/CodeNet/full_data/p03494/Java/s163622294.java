import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String n = Integer.parseInt(sc.next());
      	int[] a = new int[n];
      	int b = a.length();
      	int count;
      	for (int i = 0; i < b ; i++){
        	a[i] = Integer.parseInt(sc.next());
        }
      while(true){
      	for (int i = 0; i < b; i++) {
      		if(a[i]%2==0){
        		a[i] = a[i]/2;
        	}
          	else{
            	break
            }
        }
        count++
   	 }
      System.out.println(count);
   }	
}