import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        String[] array = input.split(" ");

        int min = Integer.parseInt(array[0]);
        int init = Integer.parseInt(array[0]);
        int max = Integer.parseInt(array[0]);
        boolean[] done = new boolean[array.length];
        int[] values = new int[array.length];
        boolean noChance = false;
        String result = "Yes";
        for (int i = 0; i < array.length - 1; i++) {
        	int current = Integer.parseInt(array[i]);
        	values[i] = current;
        	if (current == 1) noChance = true;
        	int next = Integer.parseInt(array[i+1]);
        	values[i+1] = next;
        	if (next < current && current - next >= 2) {
        		result = "No";
        		break;
        	}else if (next < current && current - next == 1) {
        		if (!isOut(done, i)) {
        			result = "No";
        			break;
        		} else {
        			done[i] = true;
        			if (noChance) {
        				result = "No";
        				break;
        			}
        		}
//        		for (int j = i; j >= 0; j--) {
//        			int c = values[j];
//        			int n = values[j+1];
//        			if (n < c && !isOut(done, j)) {
//        				done[j] = true;
//        				values[j] -= 1;
//        			}else if ((n < c && isOut(done, j))){
//        				result = "No";
//        				break;
//        			}
//        		}
//        		if (result.equals("No")) break;
        	}
        }

        System.out.println(result);
    }

    private static boolean isOut(boolean[] a, int index) {
    	for (int i = index; i >= 0; i--) {
    		if (a[i]) return true;
    	}
    	return false;
    }


}