import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int a = 0;
    int b = 0;
    int c = 0;
    int amt = 0;
    for(a = 0; a <= N ; a++ ){
        for(b = 0; b <= N -a  ; b++ ){
            amt = a * 10000 + b * 5000 +  c * (N -a -b);
            if(amt == Y){
                System.out.println(a + " " + b + " " + c);
               return ;
            }
        }
    }
    System.out.println("-1 -1 -1");
    }    
}
