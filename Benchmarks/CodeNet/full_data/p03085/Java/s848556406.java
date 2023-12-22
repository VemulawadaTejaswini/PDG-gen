import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        char b = sc.next().toCharArray()[0];

		if(b=='A') out.println('T');
		if(b=='T') out.println('A');
		if(b=='C') out.println('G');
		if(b=='G') out.println('C');
    }
}
