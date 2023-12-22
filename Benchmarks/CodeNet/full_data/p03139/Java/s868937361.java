import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum;
        int max;
        if(A>B) max =B;
        else max =A;
        if(N-(A+B)<0){
            sum = (A+B)-N;
            System.out.println(max +" "+sum);
        }
        else {
            sum = N-(A+B);
            System.out.println(max + " " + 0);
        }
    }
}