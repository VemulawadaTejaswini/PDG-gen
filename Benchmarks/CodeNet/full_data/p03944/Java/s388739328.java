import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int xmin=0,ymin=0;
		Scanner sc=new Scanner(System.in);
		Integer[] info=Arrays.asList(sc.nextLine().split(" ")).stream().map(Integer::valueOf).toArray(Integer[]::new);
		int xmax=info[0],ymax=info[1];
		while(sc.hasNextLine()) {
			String[] action=sc.nextLine().split(" ");
			int xi=Integer.parseInt(action[0]);
			int yi=Integer.parseInt(action[1]);
			switch(action[2]) {
			case "1":
				xmin=xmin>xi?xmin:xi;
				break;
			case "2":
				xmax=xmax<xi?xmax:xi;
				break;
			case "3":
				ymin=ymin>yi?ymin:yi;
				break;
			case "4":
				ymax=ymax<yi?ymax:yi;
				break;
			}
		}
		int area=(xmax-xmin)*(ymax-ymin);
		System.out.println(area<0?0:area);
	}
}