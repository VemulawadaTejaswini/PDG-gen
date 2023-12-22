import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a =  N/100;
        int b = (N - 100 * a)/10;
        int c = N - 100 * a - 10 * b;
        
        //System.out.print("a=" + a + ",b=" + b + ",c= "+ c);
        
        if(a == 7 || b == 7|| c == 7){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
     }
}