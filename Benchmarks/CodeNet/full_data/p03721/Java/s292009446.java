import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] InputA = new int[N];
			int[] InputB = new int[N];
			int count = 0;
			for(int i = 0; i < N; i++){
				InputA[i] = sc.nextInt();
				InputB[i] = sc.nextInt();
				count += InputB[i];
			}
			int num = 0;
			int[] list = new int[count];
			for(int i = 0; i < N; i++){
				for(int j = 0; j < InputB[i]; j++){
					list[num++] = InputA[i];
				}
			}
			Arrays.sort(list);
			System.out.println(list[K-1]);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
}