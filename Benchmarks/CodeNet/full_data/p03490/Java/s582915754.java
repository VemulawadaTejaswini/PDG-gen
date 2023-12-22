import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] input = scan.next().toCharArray();
		int x = scan.nextInt();
		int y = scan.nextInt();
		HashSet<Robot> nset = null;
		HashSet<Robot> oset = null;
		HashSet<Robot> set1 = new HashSet<>(1<<16);
		HashSet<Robot> set2 = new HashSet<>(1<<16);
		boolean isOne = true;
		set1.add(new Robot(0,0,0));
		oset = set1;
		nset = set2;
		//for(char operation : input) {
		for(int i = 0; i < input.length; i++) {
			char operation = input[i];
			nset.clear();
			if(operation=='F') {
				for(Robot _r : oset) {
					_r.move();
					if(Math.abs(x-_r.x)+Math.abs(y-_r.y)>input.length-i) continue;
					nset.add(_r);
				}
			}else {
				for(Robot _r : oset) {
					if(Math.abs(x-_r.x)+Math.abs(y-_r.y)>input.length-i) continue;
					nset.add(new Robot(_r.x,_r.y,(_r.dir+5)%4));
					nset.add(new Robot(_r.x,_r.y,(_r.dir+3)%4));
				}
			}
			/*
			System.out.println("-----"+operation+"-----");
			for(Robot _r : nset) {
				System.out.printf("(%d,%d,%d)\n",_r.x,_r.y,_r.dir);
			}
			*/
			if(isOne) {
				oset = set2;
				nset = set1;
			}else {
				oset = set1;
				nset = set2;
			}
			isOne = !isOne;
		}
		for(int i = 0; i < 4; i++) {
			Robot robot = new Robot(x,y,i);
			if(oset.contains(robot)) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}

class Robot{
	int x,y;
	int dir;
	Robot(int _x, int _y, int _dir) {
		x = _x;
		y = _y;
		dir = _dir;
	}
	void move() {
		if(dir%2==0) {
			if(dir==0) x++;
			else x--;
		}else {
			if(dir==1) y++;
			else y--;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(x,y,dir);
	}
	@Override
	public boolean equals(Object _o) {
		return this.hashCode() == _o.hashCode();
	}
}
