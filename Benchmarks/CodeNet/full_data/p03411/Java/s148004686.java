import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Point[] red = new Point[n];
		Point[] blue = new Point[n];
		
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			red[i] = new Point(Integer.parseInt(tmpArray[0]), Integer.parseInt(tmpArray[1]));
		}
		
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			blue[i] = new Point(Integer.parseInt(tmpArray[0]), Integer.parseInt(tmpArray[1]));
		}
		
		Arrays.sort(red);
		Arrays.sort(blue, new Comparator<Point>() {
			public int compare(Point p1, Point p2){
				return p1.y != p2.y ? p1.y - p2.y : p1.x - p2.x;
			}
		});
		
		//solve
		int count = 0;
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(blue[j].used){
					continue;
				}
				
				if(red[i].x < blue[j].x && red[i].y < blue[j].y){
//					System.out.println(red[i].x+" "+red[i].y+" "+blue[j].x+" "+blue[j].y);
					blue[j].used = true;
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);

	}

}

class Point implements Comparable<Point>{
	int x;
	int y;
	boolean used = false;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point p) {
		// TODO Auto-generated method stub
		return this.x != p.x ? this.x - p.x : this.y - p.y;
	}
	
	
}