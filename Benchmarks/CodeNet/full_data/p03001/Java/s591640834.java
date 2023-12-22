import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double W = sc.nextInt();
        double H = sc.nextInt();
        double x = sc.nextInt();
        double y = sc.nextInt();
        double S = W*H/2;
      
      if(W==x*2&&H==y*2){System.out.print(S+" "+1);}
      else{System.out.print(S+" "+0);}
 
    }
}