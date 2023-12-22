import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        Job[] a = new Job[n];
        for(int i = 0; i < n; i++){
            a[i] = new Job(scanner.nextInt()-1,scanner.nextInt());
        }
        Arrays.sort(a);
        long ans=0;
		int ain=0;
        for(int i = 0; i < m; i++){
            while(ain < n && a[ain].day == i){
                q.add(a[ain].salary);
                ain++;
            }
            if(!q.isEmpty()){
                ans += q.poll();
            }
        }
        System.out.println(ans);
    }
    static class Job implements Comparable<Job>{
		int salary,day;
		public Job(int day,int salary){
			this.salary=salary;
			this.day=day;
		}
		@Override
		public int compareTo(Job j){
			return this.day-j.day;
		}
	}
}