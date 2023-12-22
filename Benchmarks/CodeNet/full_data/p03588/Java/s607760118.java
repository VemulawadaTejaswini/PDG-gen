import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main{
	private static int n;
	
	static class Point{
		int score;
		int place;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		List<Point> list = new ArrayList<Point>();
	    for(int i=0;i<n;i++){
	    		int ai = in.nextInt();
	    		int bi = in.nextInt();
	    		
	    		Point t = new Point();
	    		t.score = bi;
	    		t.place = ai;
	    		
	    		list.add(t);
	    		
	    }
	    
	   Collections.sort(list,new Comparator<Point>() {

		@Override
		public int compare(Point o1, Point o2) {
			return o1.place  -  o2.place;
		}
	   });
		
	boolean flag = false;
	   for(int i=1;i<n;i++){
		   int diffPlace = list.get(i).place  - list.get(i-1).place;
		   int score = list.get(i-1).score - list.get(i).score;
		   
		   if( score < diffPlace){
			   flag = true;
		   }
	   }
	
	   if(flag){
		   System.out.println(0);
		   return;
	   }
	   
	   System.out.println(list.get(list.size()-1).place+list.get(list.size()-1).score);
	}
	
}
