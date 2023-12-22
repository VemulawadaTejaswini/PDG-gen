import java.util.*;

public class Lession5 {

    public static void main(String[] args) {

        Scanner parameter = new Scanner(System.in);

        String[] input1 = parameter.nextLine().split(" ");
        String[] input2 = parameter.nextLine().split(" ");
        String[] input3 = parameter.nextLine().split(" ");

        Long countKillMoster = (long) 0;

        for (int i = 0; i < input3.length; i++) {

        	Integer killNoOfMoster = Integer.valueOf(input3[i]);
        	Integer noOfMosterThisStreet = Integer.valueOf(input2[i]);

        	if (killNoOfMoster <= noOfMosterThisStreet) {

        		countKillMoster = countKillMoster + killNoOfMoster;
        	} else {

        		Integer noOfmosterNextStreet = Integer.valueOf(input2[i + 1]);
        		Integer totalMoster = noOfMosterThisStreet + noOfmosterNextStreet;

        		if (killNoOfMoster >= totalMoster) {

        			countKillMoster = countKillMoster + totalMoster;
        			input2[i + 1] = "0";
        		} else {

        			countKillMoster = countKillMoster + killNoOfMoster;
        			input2[i + 1] = String.valueOf(totalMoster - killNoOfMoster);
        		}
        	}
        }

        System.out.println(countKillMoster);
    }
}
