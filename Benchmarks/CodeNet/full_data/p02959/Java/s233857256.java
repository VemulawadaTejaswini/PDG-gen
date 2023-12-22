import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner parameter = new Scanner(System.in);

        String[] input1 = parameter.nextLine().split(" ");
        String[] input2 = parameter.nextLine().split(" ");
        String[] input3 = parameter.nextLine().split(" ");

        Integer countKillMoster = 0;

        for (int i = 0; i < input3.length; i++) {

        	if (Integer.valueOf(input3[i]) < Integer.valueOf(input2[i])) {

        		countKillMoster = countKillMoster + Integer.valueOf(input3[i]);
        	} else {

        		if (Integer.valueOf(input3[i]) >= (Integer.valueOf(input2[i]) + Integer.valueOf(input2[i + 1]))) {

        			countKillMoster = countKillMoster + Integer.valueOf(input2[i]) + Integer.valueOf(input2[i + 1]);
        			input2[i + 1] = String.valueOf(0);
        		} else {

        			countKillMoster = countKillMoster + Integer.valueOf(input3[i]);
        			input2[i + 1] = String.valueOf(Integer.valueOf(input2[i + 1]) - (Integer.valueOf(input3[i]) - Integer.valueOf(input2[i])));
        		}
        	}
        }

        System.out.println(countKillMoster);
    }
}
