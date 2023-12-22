import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
       String s = "xabacacaacaca";
      
      if(s.charAt(x)==s.charAt(y)){
        System.out.print("Yes");
      }else{
         System.out.print("No");
      }
 
    }
}