import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		Time[] times = new Time[n];
		int maxTime = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			maxTime = Math.max(maxTime, b);
			times[i] = new Time(a, b, x);
		}
		Arrays.sort(times, new Comparator<Time>() {
		public int compare(Time t1, Time t2) {
			if (t1.channel == t2.channel) {
				return t1.start - t2.start;
			} else {
				return t1.channel - t2.channel;
			}
		}
        });
		
		ArrayList<Time> list = new ArrayList<>();
		Time prev = times[0];
		for (int i = 1; i < n; i++) {
			if (times[i].channel == prev.channel && prev.end == times[i].start) {
				prev.end = times[i].end;
			} else {
				list.add(prev);
				prev = times[i];
			}
		}
		list.add(prev);
		int[] imos = new int[maxTime + 1];
		for (Time t : list) {
			imos[t.start - 1]++;
			imos[t.end]--;
		}
		int max = 0;
		for (int i = 1; i <= maxTime; i++) {
			imos[i] += imos[i - 1];
			max = Math.max(max, imos[i]);
		}
		System.out.println(max);
		
	}
	
	static class Time {
		int start;
		int end;
		int channel;
		
		public Time(int start, int end, int channel) {
			this.start = start;
			this.end = end;
			this.channel = channel;
		}
	}
}
