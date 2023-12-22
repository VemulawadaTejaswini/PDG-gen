import java.util.*;
public class Main{
	public static void main(String[] args){
   		Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int k=sc.nextInt();
        int a=1;
      	int c=0;
        while(a<=n){
            int h=sc.nextInt();
        	if(h>=k){
            	c++;
            }
          	h=0;
          	a++;
        }
      System.out.println(c);
    }
}