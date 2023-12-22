import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n=sc.nextInt(),k=sc.nextInt();
    for(int i=0;i<n;i++) {
    	int buff=sc.nextInt();
    }
    if(n==k) {
    	System.out.println(1);
    }else {
    	System.out.println((long)Math.ceil(n/(k-1)));
    }
  }
}
