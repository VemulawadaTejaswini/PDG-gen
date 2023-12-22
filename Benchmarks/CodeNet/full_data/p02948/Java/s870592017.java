import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<Job> jobs = new ArrayList<>();


		//double temp =0;
		//List<Double> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			Job job = new Job(sc.nextInt(),sc.nextInt());
			jobs.add(job);
		}

		jobs.sort((a,b) -> a.day-b.day);

		int score = 0;

		int[] list = new int[10001];
		for(int i=0;i<10001;i++) {
			list[i]=0;
		}
		int biggestEarn = 0;
		int jobIndex = 0;
		
		
		for(int i = 1;i<m+1;i++) {
			while(jobs.size()>jobIndex) {
					if(jobs.get(jobIndex).day==i) {
						list[jobs.get(jobIndex).money]+=1;
						if(biggestEarn<jobs.get(jobIndex).money) {
							biggestEarn=jobs.get(jobIndex).money;
						}
						jobIndex++;
						
					}else {
						break;
					}

			}

			if(biggestEarn>0) {
				score += biggestEarn;
				list[biggestEarn]-=1;
				if(list[biggestEarn]==0) {
					while(biggestEarn!=0) {
						biggestEarn-=1;
						if(list[biggestEarn]!=0) {
							break;
						}
					}
				}
			}

		}
		System.out.println(score);
	}

}

class Job{
	int day;
	int money;
	Job(int day, int money){
		this.day = day;
		this.money = money;
	}
}
