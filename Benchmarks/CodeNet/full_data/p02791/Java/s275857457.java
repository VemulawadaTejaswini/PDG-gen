import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int n = Integer.parseInt(str);
        int ans = 1;

        str = scan.nextLine();
        String[] substr = str.split(" ", 0);

        int[] array = new int[200000];
        for (int i=0; i<n; i++) {
        	array[i] = Integer.parseInt(substr[i]);
        }

        for (int i=1; i<n; i++) {
        	boolean flg = false;
        	for (int j=0; j<i; j++) {
        		if (array[j] < array[i]) {
        			flg = true;
        			break;
        		}
        	}
        	if (!flg) {
            	ans++;
        	}

        }

        System.out.println(ans);

        scan.close();

    }

}