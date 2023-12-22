import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println((N/2)*((N+1)/2));
        sc.close();
    }
}