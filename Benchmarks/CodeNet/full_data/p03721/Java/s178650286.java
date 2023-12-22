import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			long K = sc.nextLong();
			int[] list = new int[100001];
			for(int i = 0 ; i < N ; i++){
				int a = sc.nextInt();
				list[a] += sc.nextInt();
			}
			for(int i = 1; i < 100001; i++){
				K -= list[i];
				if(K <= 0){
					System.out.println(i);
					break;
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
}