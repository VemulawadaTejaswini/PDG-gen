import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

        for(int i = 0; i <= str.length(); i += 2){
            System.out.print(str.substring(i,i+1));
        }
        System.out.println();
	}
}