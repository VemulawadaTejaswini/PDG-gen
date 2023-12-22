import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt(),r=sc.nextInt(),s=sc.nextInt(),p=sc.nextInt();
    long max=0;
    String str=sc.next();
    StringBuilder res= new StringBuilder(str);
    for(int i=0;i<str.length();i++) {
    	if(i>=k) {
    		if(res.substring(i, i+1).equals(res.substring(i-k, i+1-k)))res.replace(i, i+1, "x");
    	}
    }
    for(int i=0;i<res.length();i++) {
    	if(res.substring(i, i+1).equals("r"))max+=p;
    	else if(res.substring(i, i+1).equals("s"))max+=r;
    	else if(res.substring(i, i+1).equals("p"))max+=s;
    }
    System.out.println(max);
    //System.out.println(res);
  }
}
