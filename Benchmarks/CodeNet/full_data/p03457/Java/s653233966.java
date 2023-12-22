import java.util.*;


public class Main {
    static class Plan{
        int t, x, y;

        Plan(int t, int x, int y){
            this.t = t;
            this.x = x;
            this.y = y;
        }

        int getT() {
            return t;
        }

        int getY() {
            return y;
        }

        int getX() {
            return x;
        }

        static int getTimeDifference(Plan p1, Plan p2){
            return Math.abs(p1.getT() - p2.getT());
        }

        static int getDistance(Plan p1, Plan p2){
            return Math.abs(p1.getX() - p2.getX()) + Math.abs(p1.getY() - p2.getY());
        }
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Plan> plans = new ArrayList<Plan>();
        for (int i = 0; i < n; i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            plans.add(new Plan(t, x, y));
        }

        String ans = "No";
        for (int i = 0; i < plans.size()-1; i++){
            int dt = Plan.getTimeDifference(plans.get(i), plans.get(i+1));
            int dist = Plan.getDistance(plans.get(i), plans.get(i+1));
            if((dt >= dist) && ((dt - dist) % 2 == 0)){
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args){
        solve();
    }
}