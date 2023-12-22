import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N,X,sum_length=0;
        N=sc.nextInt();
        X=sc.nextInt();
        sum_length = X+(N-X)+X+X+(2*(N-2*X)*(X/(N-2*X)))-(N-2*X);
        System.out.println(sum_length);
    }
}