
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {


	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Robot> robotsByL = new TreeSet<>(Comparator.comparing((Robot robot)->robot.l));
		TreeSet<Robot> robotsByR = new TreeSet<>(Comparator.comparing((Robot robot)->robot.r));
		for (int i=0;i<n;i++ ) {
			Robot robot = new Robot();
			int x=sc.nextInt();
			int len=sc.nextInt();
			int l=x-len;
			int r=x+len;
			robot.l=l;
			robot.r=r;
			robotsByL.add(robot);
		}
		for (Robot robot : robotsByL) {
			if (!robotsByR.isEmpty() && robotsByR.last().r > robot.l) {
				if (robotsByR.last().r > robot.r) {
					robotsByR.pollLast();
					robotsByR.add(robot);
				} 
			} else {
				robotsByR.add(robot);
			}
		}
		
		
		System.out.println(robotsByR.size());
	}
	
	
}
class Robot {
	int l;
	int r;
}
