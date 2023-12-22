import java.util.*;


public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        HashMap<Integer, Integer> balls = new HashMap<>();
        for(int i = 0; i < n; i++){
            int bn = sc.nextInt();
            if(balls.containsKey(bn)){
                balls.put(bn, balls.get(bn)+1);
            }else{
                balls.put(bn, 1);
            }
        }

        List<Integer> ballsNum = new ArrayList<>(balls.values());
        Collections.sort(ballsNum);
        int sum = 0;
        for(int i = 0; i < ballsNum.size()-k; i++){
            sum += ballsNum.get(i);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        solve();
    }
}
