import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer> numList = new ArrayList<>();
        int colorNum = 0;

        for (int i = 0; i < n; i++) {
        	int a = input.nextInt();
        	if (numList.isEmpty()) {
        		numList.add(a);
        	} else {
        		if (a > numList.get(colorNum)) {
        			numList.set(colorNum, a);
        		} else {
        			boolean isSet = false;
        			for (int j = 0; j < colorNum; j++) {
        				if (a > numList.get(j)) {
        					numList.set(j, a);
        					isSet = true;
        					break;
        				}
        			}
        			if (!isSet) {
        				numList.add(a);
        				colorNum++;
        			}
        		}
        	}
        }

        System.out.println(colorNum+1);
    }
}