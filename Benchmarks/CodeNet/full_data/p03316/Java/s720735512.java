import java.util.Scanner;
public class Main{
  public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
    int sn=0;
    long n=sc.nextLong();
    String str=String.valueOf(n);
    for(int i=0;i<str.length();i++) {
    	char a=str.charAt(i);
    	int b=a-'0';
    	sn=sn+b;

    }
    if(n%sn==0) {
    	System.out.println("Yes");

    }
    else {
    	System.out.println("No");
    }


  }
}