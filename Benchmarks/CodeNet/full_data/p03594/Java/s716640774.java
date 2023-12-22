import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	static int H, W, d;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		H = sc.nextInt();
		W = sc.nextInt();
		d = sc.nextInt();

	//	HashSet<String> map = new HashSet<String>();
		ArrayList<ArrayList<HashSet<String>>> map = new ArrayList<ArrayList<HashSet<String>>>();

		for(int i = 0; i < H; i++){
			map.add(new ArrayList<HashSet<String>>());
			for(int j = 0; j < W; j++){
				map.get(i).add(new HashSet<String>());
				map.get(i).get(j).add("R");
				map.get(i).get(j).add("Y");
				map.get(i).get(j).add("G");
				map.get(i).get(j).add("B");
			}
		}

		run(map, 0);
	}

	static void run(ArrayList<ArrayList<HashSet<String>>> map, int num){
		int h = (int)(num / W);
		int w = num % W;
		if(h == H){
			//System.out.println("OK");
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					System.out.print(map.get(i).get(j).iterator().next());
				}
				System.out.println();
			}
			System.exit(1);
			return;
		}

		ArrayList<ArrayList<HashSet<String>>> newMap = new ArrayList<ArrayList<HashSet<String>>>();
		for(int i = 0; i < H; i++){
			newMap.add(new ArrayList<HashSet<String>>());
			for(int j = 0; j < W; j++){
				newMap.get(i).add(new HashSet<String>());
				newMap.get(i).get(j).addAll(map.get(i).get(j));
			}
		}
		for (String color : map.get(h).get(w)) {
			newMap.get(h).get(w).clear();
			newMap.get(h).get(w).add(color);
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(Math.abs(h - i) + Math.abs(w - j) == d){
						newMap.get(i).get(j).remove(color);
						if(newMap.get(i).get(j).size() == 0){
							return;
						}
					}
				}
			}
			run(newMap, num+1);
		}
	}
}