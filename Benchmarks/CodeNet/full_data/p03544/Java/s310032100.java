import  java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int[] L = new int[a+1];
      	L[0] = 2;
      	L[1] = 1;
      		for(int i = 2; i <= a; i++){
        		L[i] = L[i - 1] + L[i - 2];
       	 	}
     	System.out.print(L[a]);
    	
    }
 
}