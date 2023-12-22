import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int index = 0;
		for(int i=0; i<week.length; i++)
			if(S.equals(week[i]))
				index = i;
		System.out.println(7-index);
		
		sc.close();
	}
}
