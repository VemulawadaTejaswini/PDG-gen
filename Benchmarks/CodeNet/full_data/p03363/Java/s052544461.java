import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        for(int i = 0;i < N;i++){
            a[i] = sc.nextLong();
        }
        int count = 0;
        for(int i = 0;i < N;i++){
            long sum = a[i];
            for(int j = i+1;j < N;j++){
                sum += a[j];
                if(sum == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
