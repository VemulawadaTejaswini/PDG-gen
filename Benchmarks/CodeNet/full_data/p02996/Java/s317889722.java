import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        List<Job> jobList = new ArrayList<Job>();
        for(int i = 0; i < n ; i++) {
          jobList.add(new Main().new Job(scanner.nextLong(),scanner.nextLong()));
        }
        jobList = jobList.stream().sorted((j1 , j2) -> (int) (j1.getDeadLine()- j2.getDeadLine())).collect(Collectors.toList());
        System.out.println("sortedList: " + jobList.toString());
        long timeSum = 0;
        for (int j = 0 ; j < n; j++ ) {
          timeSum += (jobList.get(j).getCost());
          if(timeSum > jobList.get(j).getDeadLine()) {
            System.out.println("No");
            return;
          }
        }
        System.out.println("Yes");
    }
    
   public class Job {
      private long cost;
      private long deadline;
        
      public Job( long cost, long deadline) {
        this.cost = cost;
        this.deadline = deadline;
      }
      public long getCost() {
        return this.cost;
      }
      public long getDeadLine() {
        return this.deadline;
      }
      public String toString() {
        return "cost:" + cost + " deadline:" + deadline; 
      }
    }
}