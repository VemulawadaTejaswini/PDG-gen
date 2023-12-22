import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)arr[i]=sc.nextInt();
        for (int i=1;i<n;i++) {
            int a = Math.abs(arr[i] - arr[i - 1]);
            if (a != 1 && a != 0) {
                System.out.println("No");
                System.exit(0);
                break;
            }
        }
        System.out.println("Yes");
    }

}

