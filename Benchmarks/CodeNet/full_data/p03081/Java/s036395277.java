import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private class Move {
		public char alpha;
		public char move;
		public Move(String alpha, String move) {
			this.alpha = alpha.charAt(0);
			this.move = move.charAt(0);
		}
	}
	
	private char getAlpha(String s, int index) {
		if (index < 0 || index >= s.length()) {
			return ' ';
		} else {
			return s.charAt(index);
		}
	}
	
	private int calcDropNum(String s, LinkedList<Move> moves, char left) {
		int pos = -1;
		
		for (Move move : moves) {
			if (move.move == left) {
				char srcAlpha = getAlpha(s, pos+1);
				if (srcAlpha == move.alpha) {
					pos++;
				}
			} else {
				// move right
				char srcAlpha = getAlpha(s, pos-1);
				char nowAlpha = getAlpha(s, pos);
				if (nowAlpha != move.alpha) {
					// do nothing.
				} else if (srcAlpha == move.alpha) {
					pos--;
				}
			}
		}
		
		return pos+1;
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		in.nextInt();
		int Q = in.nextInt();
		String s = in.next();
		
		LinkedList<Move> moves = new LinkedList<Move>();
		for (int i=0; i<Q; i++) {
			moves.addFirst(new Move(in.next(), in.next()));
		}
		in.close();
		
		int dropLeft = calcDropNum(s, moves, 'L');
		
		String invS = (new StringBuffer(s)).reverse().toString();
		int dropRight = calcDropNum(invS, moves, 'R');
		
		int totalDrop = Math.min(s.length(), dropLeft+dropRight);
		
		System.out.println(s.length() - totalDrop);
	}
	
	public void solve2() {
		Scanner in = new Scanner(System.in);
		in.nextInt();
		int Q = in.nextInt();
		String s = in.next();
		int[] nums = new int[s.length()];
		Arrays.fill(nums, 1);
		
		for (int i=0; i<Q; i++) {
			char alpha = in.next().charAt(0);
			char move = in.next().charAt(0);

			if (move == 'L') {
				for (int j=0; j<s.length(); j++) {
					if (s.charAt(j) == alpha) {
						if (j-1 >= 0) {
							nums[j-1] += nums[j];
						}
						nums[j] = 0;
					}
				}
			} else {
				for (int j=s.length()-1; j>=0; j--) {
					if (s.charAt(j) == alpha) {
						if (j+1 <= s.length()-1) {
							nums[j+1] += nums[j];
						}
						nums[j] = 0;
					}
				}
			}
		}
		in.close();

		System.out.println(sum(nums));
	}

	private int sum(int[] nums) {
		int sum = 0;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}
