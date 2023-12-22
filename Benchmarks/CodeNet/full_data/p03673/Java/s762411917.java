import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			StringBuilder result = new StringBuilder(""+sc.nextLong());
			for(int i = 1; i < N; i++){
				result = result.append(" "+sc.nextLong());
				result = result.reverse();
			}
			System.out.println(result.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}