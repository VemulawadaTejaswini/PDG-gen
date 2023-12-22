import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int K=sc.nextInt();
    int x=0;
    static int gcd (int a, int b) {
	int r;
	while((r = a%b)!=0) {
		a = b;
		b = r;
	}
	return b;
}
    for(int i=0;i<K+1;i++){
      x=x+i;
      for(int j=i+1;j<K+1;j++){
        x=x+3*gcd(i,j);
        y[j]=gcd(i,j);
        for(int k=j+1;k<K+1;k++){
          x=x+6*gcd(y[j],k);
        }
      }
    }
    System.out.println(x);
  }
}
