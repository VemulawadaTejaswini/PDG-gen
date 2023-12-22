
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Pair> red = new ArrayList<>();
		List<Pair> blue = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			red.add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		for(int i = 0; i < n; i++) {
			blue.add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		int ans = 0;
		red.sort(Comparator.comparing(Pair::getX));
		blue.sort(Comparator.comparing(Pair::getX));
		int i = 0;
		int j = 0;
		while(i < red.size()) {
			Pair redmin = red.get(i);
			boolean flag = false;
			while(j < blue.size()) {
				Pair bluemin = blue.get(j);
				if(redmin.getX() < bluemin.getX() && redmin.getY() < bluemin.getY()) {
					red.remove(i);
					blue.remove(j);
					flag = true;
					ans++;
					break;
				}
				j++;
			}
			if(!flag)
				i++;
		}
		red.sort(Comparator.comparing(Pair::getY));
		blue.sort(Comparator.comparing(Pair::getY));
		i = 0;
		j = 0;
		while(i < red.size()) {
			Pair redmin = red.get(i);
			boolean flag = false;
			while(j < blue.size()) {
				Pair bluemin = blue.get(j);
				if(redmin.getX() < bluemin.getX() && redmin.getY() < bluemin.getY()) {
					red.remove(i);
					blue.remove(j);
					flag = true;
					ans++;
					break;
				}
				j++;
			}
			if(!flag)
				i++;
		}
		System.out.println(ans);
	}

}

class Pair {
	private int x;
	private int y;

	protected Pair(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}