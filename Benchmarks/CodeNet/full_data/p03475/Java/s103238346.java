import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String INPUT = "";

    public static void main(String[] args) {
        InputStream is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());

        Scanner scanner = new Scanner(is);

        final int n = scanner.nextInt();

        List<Schedule> scheduleList = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            scheduleList.add(
                    new Schedule(
                            scanner.nextInt(),
                            scanner.nextInt(),
                            scanner.nextInt()
                    )
            );
        }
        List<Integer> result = solve(scheduleList);
        for (Integer time : result) {
            System.out.println(time);
        }
    }

    static List<Integer> solve(List<Schedule> schedules) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < schedules.size(); i++) {
            ret.add(solve(schedules, i));
        }
        ret.add(0);
        return ret;
    }

    static int solve(List<Schedule> schedules, int i) {
        if (i == schedules.size()) {
            return 0;
        }
        // freq : 2
        // time :0 => 0
        // time :1 => 1
        // time :2 => 0
        // freq : 5
        // time :0 => 0
        // time :1 => 4
        // time :2 => 3
        // time :3 => 2
        // time :4 => 1
        // time :5 => 0

        int currentTime = 0;
        for (int j = i; j < schedules.size(); j++) {
            Schedule schedule = schedules.get(j);
            if (schedule.startTime > currentTime) {
                currentTime = schedule.startTime + schedule.duration;
            } else {
                int mod = currentTime % schedule.frequency;
                if (mod > 0) {
                    currentTime += schedule.frequency - mod;
                }
                currentTime += schedule.duration;
            }
        }
        return currentTime;
    }

    static class Schedule {
        int duration;
        int startTime;
        int frequency;

        Schedule(int duration, int startTime, int frequency) {
            this.duration = duration;
            this.startTime = startTime;
            this.frequency = frequency;
        }
    }
}
