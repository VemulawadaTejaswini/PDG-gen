import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    boolean flag=false;
    if(s.equals("KIHBR"))flag=true;
    if(s.equals("KIHBRA"))flag=true;
    if(s.equals("KIHABAR"))flag=true;
    if(s.equals("KIHBARA"))flag=true;
    if(s.equals("KIHABR"))flag=true;
    if(s.equals("KIHABRA"))flag=true;
    if(s.equals("KIHABAR"))flag=true;
    if(s.equals("KIHABARA"))flag=true;
    if(s.equals("AKIHBR"))flag=true;
    if(s.equals("AKIHBRA"))flag=true;
    if(s.equals("AKIHBAR"))flag=true;
    if(s.equals("AKIHBARA"))flag=true;
    if(s.equals("AKIHABR"))flag=true;
    if(s.equals("AKIHABRA"))flag=true;
    if(s.equals("AKIHABAR"))flag=true;
   // if(s.equals("AKIHABARA"))flag=true;

    if(flag) {
    	System.out.println("YES");
    }else {
    	System.out.println("NO");
    }
  }
}
