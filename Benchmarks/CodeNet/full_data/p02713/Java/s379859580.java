import java.util.*;
public class Main{
	static int gcd(int p,int q){
		while((p%q)!=0){
			int r=p%q;
			p=q;
			q=r;
		}
		return q;
	}
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int k=sc.nextInt();
  	int sum=0;
  	for(int a=1;a<=k;a++){
  		for(int b=1;b<=k;b++){
  			for(int c=1;c<=k;c++){
  				
  				
  				int d= gcd(c,gcd(b,a));
  					sum +=d;
  			}
  		}
  	}
  	System.out.print(sum);
  }
}