import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n,k;
  	n=sc.nextInt();
  	k=sc.nextInt();
  	int f=0;
  	while(f==0){
  		if(n>k){
  			n%=k;
  		}else{
  			if(n>=k-n){
  				break;
  			}else{
  				n=k-n;
  				break;
  			}
  		}
  	}
  	System.out.print(n);
  }
}