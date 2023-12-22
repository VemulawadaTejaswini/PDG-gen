import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		ArrayList<Program> programs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			double start = sc.nextDouble();
			double end = sc.nextDouble();
			int channel = sc.nextInt();
			programs.add(new Program(start, end, channel));
		}
		sc.close();
		Collections.sort(programs, new ComparatorStart());
		Collections.sort(programs, new ComparatorChannel());

		for (int i = 1; i < programs.size(); i++) {
			if (programs.get(i).getStart() == programs.get(i - 1).getEnd() && programs.get(i).getChannel() == programs.get(i - 1).getChannel()) {
				programs.get(i - 1).setEnd(programs.get(i).getEnd());
				programs.remove(i);
				i--;
			}
		}

		HashMap<Double, Integer> timeTable = new HashMap<>();
		for (Program program : programs) {
			for (double d = program.getStart() - 0.5; d <= program.getEnd(); d += 0.5) {
				if (timeTable.containsKey(d)) {
					timeTable.put(d, timeTable.get(d) + 1);
				} else {
					timeTable.put(d, 1);
				}
			}
		}

		int answer = 0;
		for (double key : timeTable.keySet()) {
			answer = Math.max(answer, timeTable.get(key));
		}
		System.out.println(answer);
	}
}

class Program {
	private double start;
	private double end;
	private int channel;
	public Program(double start, double end, int channel) {
		this.start = start;
		this.end = end;
		this.channel = channel;
	}
	public double getStart() {
		return start;
	}
	public void setStart(double start) {
		this.start = start;
	}
	public double getEnd() {
		return end;
	}
	public void setEnd(double end) {
		this.end = end;
	}
	public int getChannel() {
		return channel;
	}
}

class ComparatorStart implements Comparator<Program> {
	@Override
	public int compare(Program prog1, Program prog2) {
		if (prog1.getStart() < prog2.getStart()) {
			return -1;
		} else if (prog1.getStart() > prog2.getStart()) {
			return 1;
		} else {
			return 0;
		}
	}
}

class ComparatorChannel implements Comparator<Program> {
	@Override
	public int compare(Program prog1, Program prog2) {
		if (prog1.getChannel() < prog2.getChannel()) {
			return -1;
		} else if (prog1.getChannel() > prog2.getChannel()) {
			return 1;
		} else {
			return 0;
		}
	}
}