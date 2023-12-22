import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int n = Integer.parseInt(str);
        int ans = 1;
        int min = 0;

        str = scan.nextLine();
        String[] substr = str.split(" ", 0);

        int[] array = new int[200000];
        for (int i=0; i<n; i++) {
        	array[i] = Integer.parseInt(substr[i]);
        }
        if (array[1] ==0) {
            System.out.println(ans);
            return;
        }

        if (array[1] <= array[0]) {
			min = array[1];
        	ans++;
		} else {
			min = array[0];
		}


        for (int i=2; i<n; i++) {
        	if (min >= array[i]) {
        		min = array[i];
            	ans++;
        	}
        }
        System.out.println(ans);
        scan.close();
        return;
    }

}
