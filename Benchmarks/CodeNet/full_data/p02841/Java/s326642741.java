import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] days = new int[4];
        for(int i = 0; i < 4; i++){
            days[i] = sc.nextInt();
        }
        System.out.println(days[0] != days[2] ? 1 : 0);
    }
}
