import java.util.*;


class Main {
	
	public static int startX = 0;
	public static int startY = 0;


	public static void main(String args[]) {
		
		Main main = new Main();

		main.mainmain();

	}

	public void mainmain() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int time = 0;
		int x = 0;
		int y = 0;

		boolean result = true;

		List<inner> inners = new ArrayList<>();

		for ( int i = 0; i < N; i++ ) {

			time = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();

			inners.add(new inner(time, x, y));

		}

		Collections.sort(inners, new innerComparator());

		time  = 0;
		int timePlus = 0;
		for ( inner in : inners ) {
			time = in.time - timePlus;
			x = in.x;
			y = in.y;

			if (result) {
				
				result = check(time, x, y);
				startX = x;
				startY = y;

			}
			timePlus = in.time;
		}


		System.out.println( (result) ? "Yes" : "No" );
	}

	public boolean check(int time, int x, int y) {
		int ckX = startX;
		int ckY = startY;
		for ( int i = 0; i < time; i++ ) {
			if ( ckX != x ) {
				ckX = ( ckX < x ) ? ckX + 1 : ckX - 1;
			} else {
				ckY = ( ckY < y ) ? ckY + 1 : ckY - 1;
			}
		}

		return ( ckX == x && ckY == y );
	}

	class inner {

		public int time;
		public int x;
		public int y;

		public inner(int time, int x, int y) {
			this.time = time;
			this.x = x;
			this.y = y;
		}

	}

	class innerComparator implements Comparator<inner> {
		public int compare(inner a, inner b) {
			int no1 = a.time;
			int no2 = b.time;

			if (no1 == no2) {
				return 0;
			} else if (no1 > no2) {
				return 1;
			} else {
				return -1;
			}
		}
	}

}