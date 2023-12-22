import java.util.*;


class Schedule{
    int t;
    int x;
    int y;

    Schedule (int t, int x, int y){
        this.t = t;
        this.x = x;
        this.y = y;
    }

    int getT(){
        return this.t;
    }
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }

    static int getDistance(Schedule s1, Schedule s2){
        int d = Math.abs(s1.getX() - s2.getX()) + Math.abs(s1.getY() - s2.getY());
        return d;
    }

    static int getTimeDifference(Schedule s1, Schedule s2){
        int d = Math.abs(s1.getT() - s2.getT());
        return d;
    }

}


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Schedule> s = new ArrayList<Schedule>();
        s.add(new Schedule(0, 0, 0));

        for (int i = 0; i < n; i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            Schedule newS = new Schedule(t, x, y);
            s.add(newS);
        }

        String ans = "Yes";
        for (int i = 0; i < s.size()-1; i++){
            Schedule s1, s2;
            s1 = s.get(i);
            s2 = s.get(i+1);
            int dist = Schedule.getDistance(s1, s2);
            int timeDiff = Schedule.getTimeDifference(s1, s2);

            if(dist <= timeDiff && (dist % 2 == timeDiff % 2)){
                continue;
            }
            ans = "No";
        }

        System.out.println(ans);
    }
}
