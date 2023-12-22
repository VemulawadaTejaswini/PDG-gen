import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Task[] jobs = new Task[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            jobs[i] = new Task(a,b);
        }
        sc.close();
        Arrays.sort(jobs);
        int cur = 0;
        for(int i=0;i<n;i++){
            int a = jobs[i].a;
            int b = jobs[i].b;
            if(cur+a <= b){
                cur += a;
            }else{
                System.out.println("No");
                return;
            }            
        }
        System.out.println("Yes");
        return;
    }
}

class Task implements Comparable<Task>{
    int a; int b;
    public Task(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Task t){
        if(this.b == t.b){
            return this.a - t.a;
        }else{
            return this.b - t.b;
        }
    }
}