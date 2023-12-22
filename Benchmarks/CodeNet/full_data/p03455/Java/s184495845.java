import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static final int MAXNUMBER = 100000 - 1;

	private class Position {
		int x;
		int y;

		Position() {
		}

		Position(int x, int y) {
			setPosition(x, y);
		}

		void setPosition(int x, int y) {
			this.x = x;
			this.y = y;
		}

		int getDistance(Position target) {
			int x = (this.x > target.x ? this.x - target.x : target.x - this.x);
			int y = (this.y > target.y ? this.y - target.y : target.y - this.y);
			return x + y;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Position)) {
				return false;
			}
			Position other = (Position) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

	}

	private Position currentPosition = new Position();
	private int currentSecond;

	public List<Position> createNextTravelPosition(int positionX, int positionY) {
		List<Position> postionList = new ArrayList<Position>();
		if (positionX < MAXNUMBER) {
			postionList.add(new Position(positionX + 1, positionY));
		}
		if (positionX != 0) {
			postionList.add(new Position(positionX - 1, positionY));
		}
		if (positionY < MAXNUMBER) {
			postionList.add(new Position(positionX, positionY + 1));
		}
		if (positionY != 0) {
			postionList.add(new Position(positionX, positionY - 1));
		}
		return postionList;
	}

	public boolean isAvailablePlan(int second, int positionX, int positionY) {
		Position targetPostion = new Position(positionX, positionY);
		if (currentPosition.getDistance(targetPostion) > second - currentSecond) {
			return false;
		}
		List<Position> currentPositionList = createNextTravelPosition(
				currentPosition.x, currentPosition.y);
		for (; currentSecond < second; currentSecond++) {
			List<Position> positionList = new ArrayList<Position>();
			for (Position position : currentPositionList) {
				for (Position workPosition : createNextTravelPosition(position.x,
						position.y)) {
					if (workPosition.getDistance(targetPostion) > second - currentSecond)
						continue;
					if (!positionList.contains(workPosition)) {
						positionList.add(workPosition);
					}
				}
			}
			currentPositionList = positionList;
		}
		for (Position position : currentPositionList) {
			for (Position position2 : createNextTravelPosition(position.x,
					position.y)) {
				if (position2.equals(targetPostion)) {
					currentPosition = targetPostion;
					currentSecond = second;
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			String inputLine1 = reader.readLine();
			int maxLine = Integer.valueOf(inputLine1);
			Main main = new Main();
			for (int i = 0; i < maxLine; i++) {
				String inputLine2 = reader.readLine();
				String numbers[] = inputLine2.split(" ");
				if (!main.isAvailablePlan(Integer.valueOf(numbers[0]),
						Integer.valueOf(numbers[1]),
						Integer.valueOf(numbers[2]))) {
					System.out.println("No");
					System.exit(0);
				}
			}
			System.out.println("Yes");
		} catch (IOException ignore) {
		}
	}
}
