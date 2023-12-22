import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner in = new Scanner(System.in);		
      int n = in.nextInt();
      int x = in.nextInt();
      int a[] = new int[n];
      int ac[] = new int[n];
      for( int i =0;i<n;i++){
      	a[i] = in.nextInt();
        ac[i] =a[i];
      }
      for(int i = 0; i<n-1;i++){
      	if(a[i]+a[i+1]>x){
          	int dif = a[i]+a[i+1]-x;
          	if(dif<a[i+1]){
            	a[i+1]-=dif;
            }
          	else{
            	dif-=a[i+1];
              	a[i+1] = 0;
              	a[i]-=dif;
            }
        }
      }
      int sum=0;
      for(int i = 0;i<n;i++){
      	sum+=ac[i]-a[i];
      }
      System.out.println(sum);
    }
}
