import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();

        if(A+B<=X){
            System.out.println("NO");
        }
        else{
            if(A>X){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}