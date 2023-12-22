
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nda = br.readLine().split(" ");
		int n = Integer.parseInt(nda[0]);
		int d = Integer.parseInt(nda[1]);
		int a = Integer.parseInt(nda[2]);
		ArrayList<Monster> ml = new ArrayList<Monster>();
		for(int i = 0 ; i < n ; i++) {
			String[] xh = br.readLine().split(" ");
			ml.add(new Monster(Integer.parseInt(xh[0]),Integer.parseInt(xh[1])));
		}
		Collections.sort(ml,new Comparator<Monster>() {
			@Override
			public int compare(Monster a, Monster b) {
				// TODO Auto-generated method stub
				return a.getX() - b.getX();
			}
		});
		long result = 0;
		for(int i = 0 ; i < n ; i++) {
			if(ml.get(i).getY() <= 0 ) {continue;}
			int kaisuu = (ml.get(i).getY()%a == 0 ?  ml.get(i).getY()/a : ml.get(i).getY()/a+1);
			result += kaisuu;
			for(int j = i ; j < n ; j++) {
				if(ml.get(j).getX() <= ml.get(i).getX() + 2*d) {
					//ml.get(j).setY(ml.get(j).getY() - ml.get(i).getY());
					ml.get(j).setY(ml.get(j).getY() -a * kaisuu);
				}
			}
		}
//		for(int i = 0 ; i < n ; i++) {
//			System.out.println(ml.get(i).getX() + " " + ml.get(i).getY());
//		}
//		System.out.println();
		System.out.println(result);
	}

}

class Monster {
	private int x;
	private int y;

	Monster(int a, int b) {x=a; y=b;}

	int getX() {return x;}
	int getY() {return y;}
	void setX(int n) {x = n;}
	void setY(int n) {y = n;}
}

