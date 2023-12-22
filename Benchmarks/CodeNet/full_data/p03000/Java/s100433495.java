import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int distance = 0;
        int cnt = 1;
        for(int i = 0; i < n; i++){
            int l = sc.nextInt();
            if(distance + l <= x){
                cnt++;
                distance += l;
            }
        }

        System.out.println(cnt);
        return;
    }
}