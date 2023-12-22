import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(sc.next());
      
        char c = sb.charAt(k-1);
      
        c = Character.toLowerCase(c);
        sb.setCharAt(k-1,c);
        System.out.println(sb.toString());
    }
}
