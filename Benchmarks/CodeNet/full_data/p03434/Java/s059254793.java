import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=0;
		int B=0;

		int n = sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			int b=sc.nextInt();
			list.add(b);
		}
		//System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        //System.out.println(list);

        for(int i=0;n>i;i++) {
        	if(i%2==0) {
        		A=A+list.get(i);
        	}
        	else {
        		B=B+list.get(i);
        	}
        }
        System.out.println(A-B);
	}

}
