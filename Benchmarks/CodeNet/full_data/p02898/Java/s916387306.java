import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        String line2 = sc.nextLine();
        String[] line3 = line2.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)  ary[i] = Integer.parseInt(line3[i]);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(k <= ary[i]) count++;
        }
        System.out.println(count);
    }
}