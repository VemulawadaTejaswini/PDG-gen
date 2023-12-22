import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
    long max=(n-1)*b+a,min=b+(n-1)*a;
    if(a>b) {
    	System.out.println(0);
    }else if(a==b) {
    	System.out.println(n*a);
    }else {
    	if(n!=1) {
    		System.out.println(max-min+1);
    	}else {
    		System.out.println(0);
    	}
    }
    
  }
}
