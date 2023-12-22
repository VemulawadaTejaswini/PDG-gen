import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long thre = in.nextLong();
        List<Integer> values = new ArrayList<>();
        while(in.hasNextInt()) {
        	values.add(in.nextInt());
        }
        long pattern = 0L;
        in.close();
        
        int index = 0;
        long total = 0L;
        for(int i = 0; i < num; i++) {
        	while (total < thre && num - index >= 1) {
        		total += values.get(index);
        		index++;
        	}
        	if (index == num && total < thre) {
        		break;
        	}
        	pattern += num - index + 1;
        	total -= values.get(i);
        }
        System.out.println(pattern);
    }

}
