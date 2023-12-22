import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int q = scan.nextInt();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < q; i++) {
        	int query = scan.nextInt();
        	if(query == 1) {
        		sb.reverse();
        	}else if(query ==2) {
        		int subQuery = scan.nextInt();
        		String c = scan.next();
        		if(subQuery == 1) {
        			sb.insert(0, c);
        		}else if(subQuery == 2) {
        			sb.append(c);
        		}
        	}
        }

        System.out.println(sb.toString());
    }
}
