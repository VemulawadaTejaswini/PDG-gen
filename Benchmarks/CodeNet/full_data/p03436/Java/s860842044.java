
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public class Node {
		int score;
		int x;
		int y;
		public Node(int score, int x, int y) {
			super();
			this.score = score;
			this.x = x;
			this.y = y;
		}
		
		
	}

	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] s = new char[h][];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}
    	Deque<Node> queue = new ArrayDeque<>();
        queue.add(new Node(1,0,0));
        
        int b = 0;
        Node node; 
        while( (node = queue.poll()) != null ) {
        	int score = node.score;
        	int x = node.x;
        	int y = node.y;
        	if( x<0 || w<=x || y<0 || h<=y )
        		continue;
        	if( s[y][x]!='.')
        		continue;
        	s[y][x] = '/';
        	
            boolean isGoal = x == w-1 && y == h-1;
			if( isGoal ) {
				for (int i = 0; i < h ; i++) {
					for (int j = 0; j < w ; j++) {
						if( s[i][j] != '#' )
							b++;
					}
				}
				System.out.println( b - node.score );
				return ;
            }
			
			// 
	        queue.add(new Node(score+1, x+1, y ));
	        queue.add(new Node(score+1, x-1, y ));
	        queue.add(new Node(score+1, x, y+1 ));
	        queue.add(new Node(score+1, x, y-1 ));

        }

		System.out.println(-1);
	}
	
    
}
