import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next(),c=sc.next();
        if(a.charAt(a.length()-1)==b.charAt(0)&&
            b.charAt(b.length()-1)==c.charAt(0)){
             System.out.print("YES");   
        }
        else System.out.println("NO");    
       sc.close();
    }
} 

 
