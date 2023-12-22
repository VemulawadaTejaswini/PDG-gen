import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),sum=0,sumb=0;
    String s=sc.next();
    for(int i=0;i<s.length();i++) {
    	if(s.substring(i, i+1).equals("a")&&sum<a+b) {
    		System.out.println("Yes");
    		sum++;
    	}else if(s.substring(i, i+1).equals("b")&&sum<a+b&&sumb+1<=b) {
    		System.out.println("Yes");
    		sum++;
    		sumb++;
    	}else {
    		System.out.println("No");
    	}
    }
  }
}
