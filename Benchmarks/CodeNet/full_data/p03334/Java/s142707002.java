import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D1 = sc.nextInt();
		int D2 = sc.nextInt();

		ArrayList<Point> BAN = new ArrayList<>();
		ArrayList<Point> ANS = new ArrayList<>();

		for(int d=0;d<=Math.sqrt(D1);d++){
			for(int e=d;e<=Math.sqrt(D1);e++){
				if(Math.pow(d,2) + Math.pow(e,2) == D1){
					BAN.add(new Point(d,e));
					if(d!=e) BAN.add(new Point(e,d));
				}
			}
		}
		for(int d=0;d<=Math.sqrt(D2);d++){
			for(int e=d;e<=Math.sqrt(D2);e++){
				if(Math.pow(d,2) + Math.pow(e,2) == D2){
					BAN.add(new Point(d,e));
					if(d!=e) BAN.add(new Point(e,d));
				}
			}
		}

		int x = 0,y = 0;
		ANS.add(new Point(x,y));
		System.out.println(x+" "+y);

		int turn = 1;
		outside:while(turn<Math.pow(N,2)){
			x++;
			if(x==2*N){
				x = 0;
				y++;
			}
			for(int a=0;a<ANS.size();a++){
				
				if(BAN.indexOf(new Point(x-ANS.get(a).x,y-ANS.get(a).y)) != -1) continue outside;
			}

				System.out.println(x+" "+y);
				ANS.add(new Point(x,y));
				/*int bsize = BAN.size();
				for(int b=0;b<bsize;b++){
					int i = BAN.get(b).x;
					int j = BAN.get(b).y;
					if(x+i<=2*N && y+j<=2*N && BAN.indexOf(new Point(x+i,y+j)) == -1){
					 BAN.add(new Point(x+i,y+j));
					}
					if(x-i>=0 && y+j<=2*N && BAN.indexOf(new Point(x-i,y+j)) == -1){
					 BAN.add(new Point(x-i,y+j));
					}
					if(x+i<=2*N && y-j>0 && BAN.indexOf(new Point(x+i,y-j)) == -1){
					 BAN.add(new Point(x+i,y-j));
					} 
				}*/
				turn++;
			

			
		}

	}

	static class Point{
		int x,y;
		Point(int x,int y){
			this.x = x;
			this.y = y;
		}
		public boolean equals(Object obj){
	    Point t = (Point)obj;
	    Integer tx = t.x;
	    Integer ty = t.y;

		if(x==tx && y==ty) return true;
		else return false;
		}
	}
}
