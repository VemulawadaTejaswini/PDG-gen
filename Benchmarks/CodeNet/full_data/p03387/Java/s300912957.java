import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int abc[] = new int[3];
        int total = 0;
        for(int i = 0; i < 3; i++){
            abc[i] = sc.nextInt();
            total += abc[i];
        }
        Arrays.sort(abc);
        int ans = abc[2] * 3 - total;
        System.out.println(ans % 2 == 0 ? ans/2 : ans/2+2);
    }
}
