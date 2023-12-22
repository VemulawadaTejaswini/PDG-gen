import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        int q = Integer.parseInt(line1[2]);
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)  ary[i] = k - q;
        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            ary[a - 1]++;
        }
        for(int i = 0; i < n; i++){
            if(ary[i] <= 0) System.out.println("No");
            else    System.out.println("Yes");
        }
    }
}