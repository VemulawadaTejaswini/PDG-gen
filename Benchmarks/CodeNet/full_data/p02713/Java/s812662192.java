import java.util.*;
public class Main
{
  static int gcd(int a,int b){
    if(a==0)
      return b;
    
    return gcd(b%a,a);
  }
	public static void main(String[] args) {
		
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int i,j,k;
      long sum=0;
      for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
          int g=gcd(i,j);
          for(k=1;k<=n;k++){
            sum=sum+gcd(g,k);
	}
        }
      }
      
System.out.println(sum);
      
}
}
