import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    long res=0,buff=(long)Math.pow(10, s.length())-1,buff1=(Integer.valueOf(s.substring(0, 1))+1)*(long)Math.pow(10, s.length()-1)-1;
    if(buff==Long.valueOf(s)) {
    	System.out.println(s.length()*9);
    }else if(s.length()==1) {
    	System.out.println(s);
    }else if(buff1==Long.valueOf(s)) {
    	System.out.println(Integer.valueOf(s.substring(0, 1))+9*(s.length()-1));
    }else if(s.substring(0, 1).equals("1")) {
    	System.out.println(9*(s.length()-1));
    }else {
    	res=Long.valueOf(s.substring(0,1))-1;
    	System.out.println(res+9*(s.length()-1));
    }
   // System.out.println(buff1);
  }
}