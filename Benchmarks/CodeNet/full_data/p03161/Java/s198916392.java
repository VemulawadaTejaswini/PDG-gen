import java.util.*;
public class Main{
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      	int size=sc.nextInt();
      	int k=sc.nextInt();
      	int[]  arr=new int[size];
      	for(int i=0;i<size;i++) arr[i]=sc.nextInt();
      	int[] res=new int[size];
      	res[0]=0;
      	for(int i=1;i<size;i++){
          int mins=Integer.MAX_VALUE;
          	for(int j=i-1;j>=0&&j>=i-k;j--){
            	mins=(int)Math.min(Math.abs(arr[i]-arr[j])+res[j],mins);
            }
        	res[i]=mins;
        	//System.out.println(res[i]);
        }
      System.out.println(res[size-1]);
    }
}