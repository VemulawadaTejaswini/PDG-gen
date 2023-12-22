import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
　	  String str = sc.next();    
      //Aが現れるのは何文字目？
       int a;
       for (a=0;a<s.length();a++) {
           if(s.charAt(i)=='A'){
             break;
           }
       }
       //Zが現れるのは何文字目？
       int z;
       for (z=s.length()-1;z>0;a--) {
           if(s.charAt(i)=='Z'){
             break;
           }
       }
      
      System.out.println(z-a+1);
    }
}