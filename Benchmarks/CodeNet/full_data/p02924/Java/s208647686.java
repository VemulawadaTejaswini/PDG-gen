import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        int N=obj1.nextInt();
        int sum=0;
            for (int j=1;j<=N;j++)
                sum += j % N;
        System.out.print(sum);
    }
}