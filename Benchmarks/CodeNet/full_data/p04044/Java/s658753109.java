import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int L = Integer.parseInt(sc.next());

        List<String> array = new ArrayList<String>();

        for (int i=0; i<N; i++){
        	array.add(sc.next());
        }

        Collections.sort(array);

        for (String a : array) {
        	  System.out.print(a);
       }
    }
}