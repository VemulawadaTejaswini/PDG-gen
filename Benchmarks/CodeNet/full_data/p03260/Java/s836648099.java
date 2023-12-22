import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((A % 2 == 1 & B%2 == 1)? "Yes":"No");
        sc.close();
    }
}