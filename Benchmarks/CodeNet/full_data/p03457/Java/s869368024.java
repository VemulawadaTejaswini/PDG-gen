import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private int currentPositionX;
	private int currentPositionY;
	private int currentSecond;

	private class TravelPosition {
		final int x;
		final int y;

		TravelPosition(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public List<TravelPosition> createNextTravelPosition(int positionX,
			int positionY) {
		List<TravelPosition> postionList = new ArrayList<TravelPosition>();
		postionList.add(new TravelPosition(positionX + 1, positionY));
		if (positionX != 0) {
			postionList.add(new TravelPosition(positionX - 1, positionY));
		}
		postionList.add(new TravelPosition(positionX, positionY + 1));
		if (positionY != 0) {
			postionList.add(new TravelPosition(positionX, positionY - 1));
		}
		return postionList;
	}

	public boolean isAvailablePlan(int second, int positionX, int positionY) {
		int x = currentPositionX;
		int y = currentPositionY;
		List<TravelPosition> currentPostionList = createNextTravelPosition(x, y);
		for (; currentSecond <= second; currentSecond++) {
			List<TravelPosition> postionList = new ArrayList<TravelPosition>();
			for (TravelPosition postion : currentPostionList) {
				postionList.addAll(createNextTravelPosition(postion.x,postion.y));
			}
			currentPostionList = postionList;
		}
		for (TravelPosition position : currentPostionList) {
			if (position.x == positionX && position.y == positionY) {
				currentPositionX = positionX;
				currentPositionY = positionY;
				currentSecond = second;
				return true;
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
				if (!main.isAvailablePlan(Integer.valueOf(numbers[0]), Integer.valueOf(numbers[1]), Integer.valueOf(numbers[2]))) {
					System.out.println("No");
					System.exit(0);
				}
			}
			System.out.println("Yes");
		} catch (IOException ignore) {
		}
	}
}
