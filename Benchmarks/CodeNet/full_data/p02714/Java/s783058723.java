import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	String s = sc.next();
      	long ans = 0;
      	for(int i = 1; i <= n-2 ; i++){
        	for(int j = i+1 ; j <= n-1 ; j++){
              	for(int k = j+1 ; k <= n ; k++){
                  	char si = s.charAt(i);
                  	char sj = s.charAt(j);
                  	char sk = s.charAt(k);
                 	if(si!=sj && sj!=sk && sk!=si  && j-i != k-j) ans++;
                }
            }
        }
      	System.out.println(ans);
    }
}