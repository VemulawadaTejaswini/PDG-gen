import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
      	String[] numSpl = num.split(" ");
      	int n = Integer.parseInt(numSpl[0]);
      	int k = Integer.parseInt(numSpl[1]);
		String s = sc.nextLine();
		

		String[] spl = s.split("");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n;i++){
			if(i == k-1){
				sb.append(spl[i].toLowerCase());
			}else{
				sb.append(spl[i]);
			}
		}
		System.out.println(sb);
		sc.close();
	}
}