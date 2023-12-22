import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	String[] s = new String[n];
      	String[][] k = new String[n][10];
      	int answer = 0;
      	for(int i = 0 ; i < n ; i ++){
        	s[i] = scan.next();
          	k = s[i].split("");
          	Arrays.sort(k[i]);
        }
      	for(int i = 0; i < n-1; i ++){
        	for(int j = i; j < n; j ++){
            	if(k[i] == k[j]){
                	answer++ ;
                }
            }
        }
      	System.out.print(answer);
    }
}