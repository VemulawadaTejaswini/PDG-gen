import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String result = "NO";
			for(int i =  1; i < b; i++){
				if((i * a) % b == c){
					result = "YES";
				}
			}
			System.out.println(result);
		}catch(Exception e){
			e.getMessage();
		}
	}
}