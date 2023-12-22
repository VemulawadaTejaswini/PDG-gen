import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count=0;
    for(int i=0;i<n;i++) {
    	if(sc.nextLong()%2!=0)count++;
    }
    if(count%2==0) {
    	System.out.println("YES");
    }else {
    	System.out.println("NO");
    }
  }
}
