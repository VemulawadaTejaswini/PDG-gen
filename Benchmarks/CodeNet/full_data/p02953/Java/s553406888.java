import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner parameter = new Scanner(System.in);

    	String[] line1 = parameter.nextLine().split(" ");
        String[] line2 = parameter.nextLine().split(" ");
        Integer[] mainasu1 = new Integer[line2.length];
        Integer[] mainasu2 = new Integer[line2.length];

        Integer min = 0;

        for (int i = 0; i < line2.length; i++ ) {

        	if (min == 0) {

        		min = Integer.valueOf(line2[i]);
        	} else {

        		if (min > Integer.valueOf(line2[i])) {

        			min = Integer.valueOf(line2[i]);
        		}
        	}
        }

        for (int i = 0; i < line2.length; i++) {

        	if (Integer.valueOf(line2[i]) != min) {

        		mainasu1[i] = Integer.valueOf(line2[i]) - 1;
        	} else {

        		mainasu1[i] = Integer.valueOf(line2[i]);
        	}
        }

        for (int i = 0; i < mainasu1.length; i++) {

        	mainasu2[i] = mainasu1[i];
        }

        Arrays.sort(mainasu2);

        int count = 0;

        for (int i = 0; i < mainasu1.length; i++) {

        	if (mainasu1[i] != mainasu2[i]){

        		count = count + 1;
        	}
        }

        if (count > 0) {

        	System.out.println("No");
        } else {

        	System.out.println("Yes");
        }
    }
}
