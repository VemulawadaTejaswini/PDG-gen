import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)
        ary[i] = Integer.parseInt(line1[i]);
        int min = 4950;
        for(int i = 0; i < n; i++){
            int a = 0;
            int b = 0;
            for(int j = 0; j <= i; j++)
            a += ary[j];
            for(int k = i + 1; k < n; k++)
            b += ary[k];
            int c = a - b;
            if(c < 0)
            c = b - a;
            if(c < min)
            min = c;
        }
        System.out.println(min);
    }
}