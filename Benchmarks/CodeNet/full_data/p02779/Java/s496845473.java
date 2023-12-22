import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();

            List<Integer> list = new ArrayList<Integer>();
            for(int i=0; i<num; i++){
                list.add(new Integer(scan.nextInt()));
            }

            for(int i1 = 0 ; i1<list.size();i1++) {
            	for(int i2 = 0 ; i2<list.size(); i2++) {
            		if(i1 == i2) {
            			System.out.println("NO");
            			return;
            		}
            	}
            }

            System.out.println("YES");
	        scan.close();
    }
}