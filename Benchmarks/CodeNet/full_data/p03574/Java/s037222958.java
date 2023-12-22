import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int h=sc.nextInt();
		int w=sc.nextInt();


		String[][] field=new String[h][w];
		
		Queue<Point> q=new LinkedList<Point>();

		for(int i=0;i<h;i++) {

			String buf=sc.next();
			

			field[i]=buf.split("");
			
			if(buf.contains("#")) {
				
				for(int j=0;j<w;j++) {
					if(field[i][j].equals("#")) {
						q.add(new Point(i,j));
					}
				}
				
			}
			
			

		}
		
		
		//8方向を下から右回り。
		int[] vy= {1,1,0,-1,-1,-1,0,1};
		int[] vx= {0,1,1,1,0,-1,-1,-1};

		while(!q.isEmpty()) {
			
			Point tyakumokuBomb=q.poll();
			
			
			for(int j=0;j<8;j++) {
				int nextY=tyakumokuBomb.y+vy[j];
				int nextX=tyakumokuBomb.x+vx[j];
				
				if(isoutoffiled(nextY, nextX, h, w)) {
					continue;
				}
				
				if(field[nextY][nextX].equals(".")) {
					field[nextY][nextX]=String.valueOf(1);
					
				}else if(!field[nextY][nextX].equals("#")) {
					int numofbomb=Integer.parseInt(field[nextY][nextX])+1;
					field[nextY][nextX]=String.valueOf(numofbomb);
				}
				
			}
		}
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				
				if(field[i][j].equals(".")) {
					System.out.print(0);
				}else {
					System.out.print(field[i][j]);
				}
			}
			
			System.out.println();
		}
		
		sc.close();


	}
	
	public static boolean isoutoffiled(int nextY,int nextX,int h,int w) {
		
		return nextY<=-1 || nextY>=h || nextX<=-1 || nextX>=w;
		
	}
	



}

class Point{
	
	int y;
	int x;
	
	public Point(int y, int x) {
		super();
		this.y = y;
		this.x = x;
	}
	
	
	
	
}
