import java.util.*;

public class main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int l = Math.abs(a-c);
        int m = Math.abs(a-b);
        int n = Math.abs(b-c);

        if(l <= d){
            System.out.println("Yes");
        }else{
            if(m <= d && n <= d){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}