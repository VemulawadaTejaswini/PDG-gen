import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] c = new int[n-1];
		int[] s = new int[n-1];
		int[] f = new int[n-1];
		for(int i=0;i<n-1;i++){
			c[i] = scanner.nextInt();
			s[i] = scanner.nextInt();
			f[i] = scanner.nextInt();
		}
		for(int i=0;i<n;i++){
			int time = 0;
			for(int j=i;j<n-1;j++){
				int start = s[j];
				if(time < s[j]){
					time = s[j];
				}else{
					while(start < time){
						start += f[j];
					}
					time = start;
				}
				time += c[j];
			}
			System.out.println(time);
		}
	}

}
