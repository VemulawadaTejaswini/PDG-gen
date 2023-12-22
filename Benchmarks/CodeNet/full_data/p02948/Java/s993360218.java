import java.util.*;
import java.io.*;
class Job{
    long reward;
    long wait;
    public Job(long w, long r){
        this.reward = r;
        this.wait = w;
    }
    static Comparator<Job> moreReward(){
        return (x,y) -> Long.compare(y.reward, x.reward);
    }
    static Comparator<Job> faster(){
        return (x,y) -> Long.compare(x.wait, y.wait);
    }

    public String toString(){
        return "["+wait+" "+reward+"]";
    }

}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Job> jobs = new ArrayList<Job>(N);
        for(int n=0; n<N; n++) jobs.add(new Job(sc.nextLong(), sc.nextLong()));
        jobs.sort(Job.faster());
        LinkedList<Job> joblist = new LinkedList<>(jobs);

        PriorityQueue<Job> validJobs = new PriorityQueue<>(Job.moreReward());
        long ans = 0;
        for(int m=1; m<=M; m++){
            while(!joblist.isEmpty() && joblist.getFirst().wait<=m) validJobs.add(joblist.pop());
            if(!validJobs.isEmpty()) ans += validJobs.poll().reward;
        }
        System.out.println(ans);
    }
}