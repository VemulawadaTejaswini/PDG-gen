import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws Exception {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int howManyNights = Integer.parseInt(br.readLine());
			int firstChargeDay = Integer.parseInt(br.readLine());
			int firstCharge = Integer.parseInt(br.readLine());
			int subsequentCharge = Integer.parseInt(br.readLine());

			int result = getSumCharge(howManyNights, firstChargeDay, firstCharge, subsequentCharge);

			System.out.println(result);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	public static int getSumCharge(int howManyNights, int firstChargeDay, int firstCharge, int subsequentCharge) {
		int sumCharge = 0;

		for(int i = 1; i <= howManyNights; i++) {
			if (i <= firstChargeDay) {
				sumCharge += firstCharge;
			} else {
				sumCharge += subsequentCharge;
			}
		}

		return sumCharge;
	}
}