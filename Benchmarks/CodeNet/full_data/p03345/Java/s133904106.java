import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),k=sc.nextLong();
    if(Math.abs(a-b)>1000000000000000000L) {
    	System.out.println("Unfair");
    }else {
    	if(k%2==0) {
    		System.out.println(a-b);
    	}else {
    		System.out.println(b-a);
    	}
    }
  }
}
