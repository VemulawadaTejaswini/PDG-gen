import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int N = Integer.parseInt(spl[0]);
		int A = Integer.parseInt(spl[1]);
		int B = Integer.parseInt(spl[2]);
		int C = Integer.parseInt(spl[3]);
		int D = Integer.parseInt(spl[4]);
		String S = sc.nextLine();
		sc.close();
		if(S.substring(A,D).contains("##")){
			System.out.println("No");
			return;
		}
		String[] spl2 = S.split("");
		StringBuilder sb = new StringBuilder();

		for(int i = 0;i < spl2.length;i++){
			if(i == D - 1){
				sb.append("#");
			}else{
				sb.append(spl2[i]);
			}
		}
		System.out.println(sb.toString());
		if(sb.toString().substring(A, C-1).contains("##")){
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}