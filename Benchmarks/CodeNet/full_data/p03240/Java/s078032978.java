import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.jar.Pack200;

class Point extends Object{
	int x;
	int y;
	int h;
	public Point(int x,int y, int h) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.x=x;
		this.y=y;
		this.h=h;
	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return this.x+" "+this.y+" "+this.h;
	}

	public boolean equals(Point a) {
		if(this.x==a.x&this.y==a.y&this.h==a.h) {
			return true;
		}
		else {
			return false;
		}
	}


	public ArrayList<Point> range(int size){
		ArrayList<Point> ans = new ArrayList<>();
		if(size==0) {
			ans.add(new Point(this.x, this.y, this.h));
			return ans;
		}
		//X=0のとき
		if((this.y+size<=100)) {
			ans.add(new Point(this.x, this.y+size, this.h+size));
		}
		if(this.y-size>=0) {
			ans.add(new Point(this.x, this.y-size, this.h+size));
		}
		for(int x=1;x<size;x++) {
			if((this.x+x<=100)&(this.y+size-x<=100)) {
				//高さは一旦無視
				ans.add(new Point(this.x+x, this.y+size-x, this.h+size));
			}
			if((this.x-x>=0)&(this.y+size-x<=100)) {
				//高さは一旦無視
				ans.add(new Point(this.x-x, this.y+size-x, this.h+size));
			}
			if((this.x+x<=100)&(this.y-size+x>=0)) {
				//高さは一旦無視
				ans.add(new Point(this.x+x, this.y-size+x, this.h+size));
			}
			if((this.x-x>=0)&(this.y-size+x>=0)) {
				//高さは一旦無視
				ans.add(new Point(this.x-x, this.y-size+x, this.h+size));
			}
		}
		//X=sizeのとき
		if((this.x+size<=100)) {
			ans.add(new Point(this.x+size, this.y, this.h+size));
		}
		if(this.x-size>=0) {
			ans.add(new Point(this.x-size, this.y, this.h+size));
		}
		return ans;
	}
}


class PointComparator implements Comparator<Point> {
	@Override
	public int compare(Point p1, Point p2) {
		return p1.h < p2.h ? -1 : 1;
	}
}

public class Main2 {
	public static void main(String args[]) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = in.readLine();
			Integer n = Integer.valueOf(str);
			ArrayList<Point> condition = new ArrayList<>();
			ArrayList<Point> candidate = new ArrayList<>();
			for(int i=0;i<n;i++) {
				str = in.readLine();
				condition.add(new Point(Integer.valueOf(str.split(" ")[0]), Integer.valueOf(str.split(" ")[1]), Integer.valueOf(str.split(" ")[2])));
			}
			condition.sort(new PointComparator());
			int count = 0;

			while(true) {
				ArrayList<Point> tmp2 = new ArrayList<>();

				for(Point c:condition) {
					if(tmp2.size()==0) {
						tmp2.addAll(c.range(count+condition.get(condition.size()-1).h-c.h));
					}
					else {
						tmp2 = common(tmp2, c.range(count+condition.get(condition.size()-1).h-c.h));
					}
					if(tmp2.size()==0) {
						break;
					}
				}
				if(tmp2.size()==1) {
					candidate.addAll(tmp2);
					break;
				}
				count++;
			}
			System.out.println(candidate.get(0));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static ArrayList<Point> common(ArrayList<Point> a,ArrayList<Point>b) {
		ArrayList<Point> ans = new ArrayList<>();
		for(Point p : a) {
			for(Point p2 : b) {
				if(p.equals(p2)) {
					ans.add(p);
				}
			}
		}
		return ans;
	}
}
