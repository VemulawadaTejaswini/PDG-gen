import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<JobInfo> jobInfoList = new ArrayList<JobInfo>();
		for(int i= 0;i < n;i++) {
			JobInfo jobInfo = new JobInfo(sc.nextInt(),sc.nextInt());
			jobInfoList.add(jobInfo);
		}
		jobInfoList.sort((a,b)-> a.getKigen() - b.getKigen());
		long totalTask = 0;
		for(JobInfo jobInfo:jobInfoList) {
			totalTask += jobInfo.getTime();
			if(totalTask > jobInfo.getKigen()) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	static class JobInfo {
		private int time;
		private int kigen;
		public JobInfo(int time,int kigen) {
			this.time = time;
			this.kigen =kigen;
		}
		public int getTime() {
			return time;
		}
		public void setTime(int time) {
			this.time = time;
		}
		public int getKigen() {
			return kigen;
		}
		public void setKigen(int kigen) {
			this.kigen = kigen;
		}
	}
}