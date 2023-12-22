import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int numOfJob = sc.nextInt(); // N
        int deadline = sc.nextInt(); // M
        // List<Job> jobs = new LinkedList<>();
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < numOfJob; i++) {
            int delay = sc.nextInt(); // A[i]
            int reward = sc.nextInt(); // B[i]
            jobs.add(new Job(delay, reward));
        }
        // delay の昇順に並び替え
        jobs.sort((a, b) -> a.delay - b.delay);

        int ans = 0;
        // 制約の厳しい後ろの日程から見ていく。
        // こういう問題では制約の大きい方から見ていくのが定石らしい。
        // 制約が大きい方が決まりやすいからかな。
        for (int day = deadline - 1; day >= 0; day--) {
            int havingDay = deadline - day;
            // jobsを引数で渡せば、ローカル変数で済む。
            Job bestJob = findBestJob(jobs, havingDay);
            if (bestJob == null) continue;
            if (jobs.size() == 0) break;
            ans += bestJob.getReward();
            // 一度使ったjobは使用できないので、削除する。
            // removeの引数には、jobオブジェクトを指定できる。
            jobs.remove(bestJob);
        }

        System.out.print(ans);
    }

    Job findBestJob(List<Job> jobs, int havingDay) {
        if (jobs.size() == 0) return null;
        // 初期値として最低なJobを設定する。
        Job bestJob = new Job(0 ,0);
        for (Job job : jobs) {
            if (job.getDelay() <= havingDay) {
                if (job.getReward() > bestJob.getReward()) {
                    bestJob = job;
                }
            }
            else {
                break;
            }
        }
        if (bestJob.getReward() == 0) {
            return null;
        }
        else {
            return bestJob;
        }
    }

    class Job {
        private int delay;
        private int reward;

        Job(int delay, int reward) {
            this.delay = delay;
            this.reward = reward;
        }
        int getDelay() {
            return delay;
        }
        int getReward() {
            return reward;
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}