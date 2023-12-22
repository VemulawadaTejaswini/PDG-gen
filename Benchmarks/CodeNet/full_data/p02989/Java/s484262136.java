import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        String line1 = sc.nextLine();
        String[] line2 = line1.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)
        ary[i] = Integer.parseInt(line2[i]);
        Arrays.sort(ary);
        if(ary[ary.length / 2] == ary[ary.length / 2 - 1])
        System.out.println(0);
        else
        System.out.println(ary[ary.length / 2] - ary[ary.length / 2 - 1]);
    }
}