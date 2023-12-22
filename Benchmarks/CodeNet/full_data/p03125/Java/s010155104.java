import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a % b == 0){
          int result = a + b;
          System.out.println(result);
        }else(a % b != 0){
          int result = b - a;
          System.out.println(result);
        }
    }
}