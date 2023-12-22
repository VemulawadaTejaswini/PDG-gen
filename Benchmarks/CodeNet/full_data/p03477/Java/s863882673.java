import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt() + sc.nextInt();
                int b = sc.nextInt() + sc.nextInt();
                if(a > b) System.out.println("Left");
                else if(a < b) System.out.println("Right");
                else System.out.println("Balanced");
                sc.close();
        }
}//0=48
 //a=97 a -> +26 = 123
//鶏になれ