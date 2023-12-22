import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        int distance = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            l.add(num);
        }


        int cnt = 1;
        for(int i = 0; i < n; i++){
            distance += l.indexOf(i);
            if(distance <= x) cnt++;
        }
        System.out.println(cnt);
        return;
    }
}
