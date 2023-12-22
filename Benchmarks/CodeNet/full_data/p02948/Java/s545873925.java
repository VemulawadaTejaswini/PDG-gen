import java.util.*;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int numOfJob = sc.nextInt(); // N
        int deadline = sc.nextInt(); // M
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < numOfJob; i++) {
            int delay = sc.nextInt(); // A[i]
            int reward = sc.nextInt(); // B[i]
            jobs.add(new Job(delay, reward));
        }
        // delay の昇順に並び替え
        jobs.sort((a, b) -> a.delay - b.delay);

        int ans = 0;
        for (int day = deadline - 1; day >= 0; day--) {
            int havingDay = deadline - day;
            Job bestJob = findBestJob(jobs, havingDay);
            if (bestJob == null) continue;
            ans += bestJob.getReward();
            // 一度使ったjobは使用できないので、削除する。
            jobs.remove(bestJob);
            if (jobs.size() == 0) break;
        }

        System.out.print(ans);
    }

    // ベストなJobを返す。該当するJobがなければ、null を返す。
    Job findBestJob(List<Job> jobs, int havingDay) {
        Queue<Job> queue = new PriorityQueue(Comparator.comparing(Job::getReward).reversed());
        for (Job job : jobs) {
            if (job.getDelay() <= havingDay) {
                queue.add(job);
            }
            else {
                break;
            }
        }
        if (queue.size() == 0) return null;
        Job bestJob = queue.poll();
        return bestJob;
    }

    class Job  {
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