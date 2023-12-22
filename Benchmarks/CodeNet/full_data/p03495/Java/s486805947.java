

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {


    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int k=sc.nextInt();
    int[] a= new int[n];
    int[] b=new int[n+1];
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    	b[a[i]]++;
       }
  java.util.Arrays.sort(b);
   int ans = 0;
   for( int p=0;p<=n-k;p++) {
	   ans = b[p]+ans;

   }
   System.out.println(ans);
	}

}
