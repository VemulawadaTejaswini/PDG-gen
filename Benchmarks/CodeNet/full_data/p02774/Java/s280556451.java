import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n =sc.nextLong();long k =sc.nextLong();long[] array = new long[n];long[] new_array = new long[n*(n-1)/2];
        for(int i=0;i<n;i++)
            array[i]=sc.nextLong();
        int time=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                new_array[time]=array[i]*array[j];
                time++;
            }
        }
        Arrays.sort(new_array);
        System.out.println(new_array[k-1]);
}
    }