import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i){
            a[i] = reader.nextInt();
        }
        int max = 0;
        int candidate;
        for(int i=0;i<max;++i){
            candidate = sumOfXOR(i, a);
            if(candidate>max)
                max=candidate;
        }
        System.out.println(max);
        reader.close();
    }
     private static int sumOfXOR(int x, int[] a){
        int sum = 0;
        for(int a_i:a){
            sum+=x^a_i;
        }
        return sum;
     }
}