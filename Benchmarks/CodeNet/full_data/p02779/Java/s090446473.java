import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int num = Integer.parseInt(line);
        String[] elementStr = sc.nextLine().split(" ");

        ArrayList <Integer> elem = new ArrayList<Integer>();
        //Integer[] elem = new Integer[num];
        for(int i = 0; i < num ;i++) {
        	elem.add(Integer.parseInt(elementStr[i]));
        }
        Collections.sort(elem);
        boolean distinction = true;
        for(int i = 0; i < elem.size()-1; i++) {
        	if(elem.get(i) == elem.get(i + 1)) {
        		distinction = false;
        		break;
        	}
        }

        if(distinction) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
    }
}