import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		List<Pos> listRed = new ArrayList<>();
		List<Pos> listBlue = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			listRed.add(new Pos(s.nextInt(), s.nextInt()));
		}
		
		listRed.sort(Comparator.comparing(Pos::getMin));;
		for (int i = 0; i < N; i++) {
			listBlue.add(new Pos(s.nextInt(), s.nextInt()));
		}
		listBlue.sort(Comparator.comparing(Pos::getMin));

		int count = 0;
		for (int i = 0; i < listRed.size(); i++) {
			for (int j = 0; j < listBlue.size(); j++) {
				Pos red = listRed.get(i);
				Pos blue = listBlue.get(j);
				
				if ((red.x < blue.x) && (red.y < blue.y)) {
					listRed.remove(i);
					listBlue.remove(j);
					i--;
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
	
	public static class Pos{
		public int x;
		public int y;
		
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int getMax(){
			return Math.max(this.x, this.y);
		}
		public int getMin(){
			return Math.min(this.x, this.y);
		}
		@Override
		public String toString() {
			return "(" + this.x + " ," + this.y + ")";
		}
	}
}
