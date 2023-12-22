import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next(),res="";
    int w=sc.nextInt();
    for(int i=0;i<s.length();i++) {
    	if(i%w==0)res+=s.substring(i, i+1);
    }
    System.out.println(res);
  }
}
