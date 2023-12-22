import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			StringBuilder result = new StringBuilder(""+sc.nextLong());
			for(int i = 1; i < N; i++){
				if(i % 2 == 0){
					result.insert(result.length(), " "+sc.nextLong());
				}else{
					result.insert(0, sc.nextLong()+" ");
				}
			}
			if(N%2 != 0)result.reverse();
			System.out.println(result.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}