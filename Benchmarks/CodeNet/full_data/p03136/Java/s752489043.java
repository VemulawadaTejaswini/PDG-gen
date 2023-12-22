import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        int max=ar[ar.length-1];
        int sum=0;
        for(int i=0;i<n-1;i++){
        sum+=ar[i];
        }
        if(max<sum){
        System.out.println("Yes");
        }else{
         System.out.println("No");
        }
    }
}