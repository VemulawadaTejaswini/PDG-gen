import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int allnum = 0;

		List<String> colorlist = new ArrayList<>();
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			String c = color(a);

			if(c.equals("all")) {
				allnum++;
			}else if(!colorlist.contains(c)) {
				colorlist.add(c);
			}
		}

		int min = colorlist.size();
		int max = min + allnum > 8 ? 8 : min + allnum;
		System.out.println(min + " " + max);
	}

	public static String color(int rate) {
		if(rate < 400) {
			return "gray";
		}else if(rate < 800) {
			return "brown";
		}else if(rate < 1200) {
			return "green";
		}else if(rate < 1600) {
			return "skyblue";
		}else if(rate < 2000) {
			return "blue";
		}else if(rate < 2400) {
			return "yellow";
		}else if(rate < 2800) {
			return "orange";
		}else if(rate < 3200) {
			return "red";
		}else {
			return "all";
		}
	}
}
