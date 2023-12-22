import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String answer = "YES";

        Set<Integer> map = new HashSet<>();
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            if(map.contains(a)){
                answer = "NO";
                break;
            }
            map.add(a);
        }
        System.out.println(answer);
    }
}