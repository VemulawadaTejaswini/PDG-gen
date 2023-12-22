import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        
        str1 = str1.substring(0,1);
        str2 = str2.substring(0,1);
        str3 = str3.substring(0,1);
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        str3 = str3.toUpperCase();
        
        System.out.println(str1+str2+str3);
    }
}