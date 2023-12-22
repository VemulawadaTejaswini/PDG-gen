import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
 
      String S =sc.next();
      char[] a = S.toCharArray();
      
        if(a[0]==a[1]&& a[1]!=a[2]&& a[2]==a[3]){
          System.out.print("Yes");
        }
        else if(a[0]==a[2]&& a[2]!=a[3]&& a[3]==a[1]){
        System.out.print("Yes");
        }
        else if(a[0]==a[3]&& a[3]!=a[1]&& a[1]==a[2]){
         System.out.print("Yes");
        }else{
        System.out.print("No");
        }
    }
}