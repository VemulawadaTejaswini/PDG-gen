import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        while(kb.hasNext()){
        	String str1=kb.next();
        	String str2=kb.next();
        	String str3=kb.next();
        	char a[]=str1.toCharArray();
        	char b[]=str2.toCharArray();
        	char c[]=str3.toCharArray();
        	System.out.print(a[0]);
        	System.out.print(b[1]);
        	System.out.println(c[2]);
        }
              
    }

}