import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int sum = 0;
        int count = 0;
        while(sum < B){
            if(count == 0)
                sum += A;
            else
                sum += A-1;
            count++;
        }
        System.out.println(count);
    }
}