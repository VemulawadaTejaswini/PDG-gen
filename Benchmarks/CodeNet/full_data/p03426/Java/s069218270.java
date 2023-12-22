import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		run();
	}


	private static void run() {
		try(Scanner sc = new Scanner(System.in)){
			ValueArray valueArray = new ValueArray(sc.nextInt(), sc.nextInt());
			int d = sc.nextInt();
			for(int y = 0 ; y < valueArray.getH(); y++) {
				for(int x = 0 ; x < valueArray.getW(); x++) {
					valueArray.setValue(x, y, sc.nextInt());
				}
			}
			int q = sc.nextInt();
			int inputArray[][] = new int[2][q];
			for(int i = 0; i < q ; i++) {
				inputArray[0][i] = sc.nextInt();
				inputArray[1][i] = sc.nextInt();
			}
			execute(q, inputArray, d, valueArray);
		}

	}

	private static void execute(int q ,int inputArray[][],int d,ValueArray valueArray) {
		for(int i = 0 ; i < q ; i++) {
			executeTest(inputArray[0][i],inputArray[1][i],d,valueArray);
		}
	}

	private static void executeTest(int l, int r, int d,ValueArray valueArray) {
		int moveCount = (r - l)/d;
		int result = 0;
		if(moveCount == 0) {
			System.out.println(result);
			return;
		}
		Position prePosition = getPosition(l, valueArray);
		Position targetPosition = prePosition;
		for(int i = 1; i <= moveCount ; i++) {
			int targetValue = l + d * i;
			prePosition = targetPosition;
			targetPosition = getPosition(targetValue, valueArray);
			result += getMP(prePosition,targetPosition);
		}
		System.out.println(result);
	}

	private static int getMP(Position prePosition, Position targetPosition) {
		return Math.abs(targetPosition.getX() - prePosition.getX()) + Math.abs(targetPosition.getY() - prePosition.getY());
	}


	private static Position getPosition(int value, ValueArray valueArray) {
		for(int x = 0 ; x < valueArray.getW(); x++) {
			for(int y = 0 ; y < valueArray.getH(); y++) {
				if(valueArray.getValue(x, y) == value) {
					return new Position(x, y);
				}
			}
		}
		// TODO It should be thorow the exception
		return new Position(0,0);
	}

	private static class Position {
		int x;
		int y;

		private Position(int x, int y) {
			this.x = x;
			this.y = y;
		}

		private int getX() {
			return x;
		}

		private int getY() {
			return y;
		}
	}


	private static class ValueArray{
		int h;
		int w;
		int valueArray[][];

		private ValueArray(int h,int w) {
			this.h = h;
			this.w = w;
			this.valueArray = new int[w][h];
		}

		private int getH() {
			return h;
		}

		private int getW() {
			return w;
		}

		private void setValue(int x, int y, int value) {
			this.valueArray[x][y] = value;
		}

		private int getValue(int x, int y) {
			return valueArray[x][y];
		}

	}


}
