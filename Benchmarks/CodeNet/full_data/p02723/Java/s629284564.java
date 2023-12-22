import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String s = scan.next();
         int count=0;
         if(s.charAt(2)==s.charAt(3)){
             count++;
         }
         if(s.charAt(4)==s.charAt(5)){
            count++;
        }
        if(count==2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
    }