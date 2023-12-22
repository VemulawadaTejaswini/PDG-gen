import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ar = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextLong();
        }
        Arrays.sort(ar);
        if(ar[n - 1] <= 0){
            StringBuilder result = new StringBuilder();
            long curr = ar[n - 1];
            for(int i = n - 2; i >= 0; i--){
                result.append(curr);
                result.append(' ');
                result.append(ar[i]);
                result.append('\n');
                curr = curr - ar[i];
            }
            System.out.println(curr);
            System.out.println(result.toString());
        }else if(ar[0] >= 0){
            StringBuilder result = new StringBuilder();
            long curr = ar[0];
            for(int i = 1; i < n - 1; i++){
                result.append(curr);
                result.append(' ');
                result.append(ar[i]);
                result.append('\n');
                curr = curr - ar[i];
            }
            System.out.println(ar[n - 1] - curr);
            result.append(ar[n - 1]);
            result.append(' ');
            result.append(curr);
            System.out.println(result.toString());
        }else{
            int index = 1;
            long curr = ar[n - 1];
            StringBuilder result = new StringBuilder();
            while(index < n && ar[index] <= 0){
                result.append(curr);
                result.append(' ');
                result.append(ar[index]);
                result.append('\n');
                curr = curr - ar[index];
                index += 1;
            }
            long currAlt = ar[0];
            for(int i = index; i < n - 1; i++){
                result.append(currAlt);
                result.append(' ');
                result.append(ar[i]);
                result.append('\n');
                currAlt -= ar[i];
            }
            System.out.println(curr - currAlt);
            result.append(curr);
            result.append(' ');
            result.append(currAlt);
            System.out.println(result.toString());
        }
    }
}
