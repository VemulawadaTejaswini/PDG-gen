import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] an = new int[5];
        an[0] = sc.nextInt();
        an[1] = sc.nextInt();
        an[2] = sc.nextInt();
        an[3] = sc.nextInt();
        an[4] = sc.nextInt();

        int last = -1;
        int min = 10;
        for(int i = 0;i < 5;i++){
            int d = an[i] % 10;
            if(d != 0 && d < min){
                min = d;
                last = i;
            }
        }

        int ans = 0;
        for(int i = 0;i < 5;i++){
            if(last == i){
                ans += an[i];
            } else {
                ans += an[i];
                int d = an[i] % 10;
                if(d != 0){
                    ans += 10 - d;
                }
            }
        }
        System.out.println(ans);
    }
}
