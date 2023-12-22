import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int max_index = 0;
        int min_index = 0;

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                max_index = i;

            }
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        if (max_index == min_index) {
            min_index = 0;
            max_index = n-1;
        }

        for(int i = 0; i < n; i++) {
            if( i != min_index && i != max_index) {
                if(arr[i] < 0) {
                    str.append(max + " " + arr[i]);
                    max = max - arr[i];

                    str.append("\n");
                }
                else{
                    str.append(min + " " + arr[i]);
                    min = min - arr[i];

                    str.append("\n");
                }
            }
        }
        System.out.println(max - min);
        str.append(max + " " + min);
        System.out.println(str.toString());
    }
}
