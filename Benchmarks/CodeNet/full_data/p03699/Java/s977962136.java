import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[] list = new int[N];
			int result = 0;
			for(int i = 0 ; i < N ; i++){
				list[i] = sc.nextInt();
				result += list[i];
			}
			if(result % 10 == 0){
				Arrays.sort(list);
				for(int i  = 0 ; i < N ; i++){
					if(list[i] % 10 != 0){
						result -= list[i];
						break;
					}
					if(i == N-1){
						result = 0;
					}
				}
				
			}
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
}