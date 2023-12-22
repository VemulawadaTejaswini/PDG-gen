import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ws[] = {"Sunny", "Cloudy", "Rainy"};
		String s = sc.next();
		for(int i = 0 ; i < ws.length ; ++i){
			if(ws[i].equals(s)){
				int j = (i + 1) % ws.length;
				System.out.println(ws[j]);
				break;
			}
		}
	}
}
