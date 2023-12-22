import java.util.*;
public class Main {

   public static void main(String[] args) {
    int count=0;
    int temp=0;
  	Scanner scan=new Scanner(System.in); 
    String s=scan.next(); 
    char[] ch = new char[s.length()];
    char[] rev = new char[s.length()];
    for (int i = 0; i < ch.length; i++) { 
            ch[i] = s.charAt(i); 
    } 
    for (int i = rev.length-1; i >=0; i--) { 
            rev[temp] = s.charAt(i); 
      		temp++;
    } 
    for(int i = 0; i<= (ch.length/2)-1; i++) {
    	if(ch[i] != rev[i]){
        count++;
        }
    }
    System.out.println(count);
   }
}