import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s[] = sc.next().split("");

        int count = 1;

        for (int i = 0; i < n-1; i++) {
            if (!(s[i].equals(s[i+1]))) {
                count++;
            }
        }

        System.out.println(count);
	}
}
