import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A>=B){
            System.out.println("delicious");
        }
        else if(A<B && A+X>=B){
            System.out.println("safe");
        }
        else{
            System.out.println("dangerous");
        }
    }
}