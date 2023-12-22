    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n=in.nextInt(),m=in.nextInt();

            Job[] arr=new Job[n];
            for(int i=0;i<n;i++)
                arr[i]=new Job(in.nextInt(),in.nextInt());

            Arrays.sort(arr,new Comparator<Job>(){
                public int compare(Job j1,Job j2){
                    return (j1.days-j2.days)*-1;
                }
            });
            PriorityQueue<Job> pq=new PriorityQueue<>();
            int req=0,i=0;
            while(i<n && arr[i].days>m)
                i++;
            for(int d=0;d<m && i<n;d++){
                pq.add(arr[i++]);
                while(i<n && arr[i].days-d==m)
                    pq.add(arr[i++]);
                while(pq.size()>d+1)
                    pq.poll();
            }
            long totalReward = 0;
            while(!pq.isEmpty())
                totalReward+=pq.poll().reward;
            System.out.println(totalReward);
            
            //System.out.println(Arrays.toString(arr));
        }
        static class Job implements Comparable<Job>{
            int days,reward;
            Job(int days,int reward){
                this.days=days;
                this.reward=reward;
            }
            public int compareTo(Job O){
                return this.reward-O.reward;
            }
            public String toString(){
                return "{ days : "+days+" , "+reward+"}";
            }
        }
    }