import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        String givenNum = sc.next();
        int dividedCount = 0;
        for (int i = 0; i < givenNum.length(); i++) {
            for (int j = i + 1; j <= givenNum.length(); j++) {
                String cutNum = givenNum.substring(i, j);
                long parsedNum = Long.parseLong(cutNum);
                dividedCount += parsedNum % 2019 == 0 ? 1 : 0;
            }
        }
        System.out.println(dividedCount);
    }
}
