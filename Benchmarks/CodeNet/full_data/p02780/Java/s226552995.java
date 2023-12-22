import java.util.*;

public class Main{
  public static double e(int n){
    return (double)(n+1)/(double)2;
  }
	public static int sum(int n,int m){
		int j=0;
		for(int i=0;i<m;i++){
			j+=n-i;
		}
		return j;
	}
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt(),f=0;
    int[] p=new int[n];
    double max=0,fmax=0;
    for(int i=0;i<n;i++){
      p[i]=sc.nextInt();
    	if(i>=k){
    		if(fmax<sum(p[i],k)){
    			fmax=sum(p[i],k);
    			f=i;
    		}
    	}
    }
  	for(int i=0;i<k;i++){
  		max+=e(p[f-i]);
  	}
  	
  	System.out.println(max);
  }
}
