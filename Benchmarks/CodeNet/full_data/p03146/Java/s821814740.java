import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(s);
        int index = 0;
        int ans = 0;
        while(true) {
        	int temp = list.get(index);
        	if(temp % 2 == 0) {
        		temp = even(temp);
        	}else {
        		temp = odd(temp);
        	}

        	if(list.contains(temp)) {
        		System.out.println(list.size() + 1);
        		return;
        	}
        	list.add(temp);
        	index++;
        }
    }
    public static int odd (int n) {
    	return 3 * n + 1;
    }
    public static int even(int n) {
    	return n / 2;
    }
}