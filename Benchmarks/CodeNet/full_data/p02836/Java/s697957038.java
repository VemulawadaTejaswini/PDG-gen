import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		String S[] = sc.next().split("");
		int s = S.length;
		for(int i=0;i<S.length/2;i++){
			if(S[i].equals(S[S.length-1-i])){
			}else{
				a++;
			}
		}
		sc.close();
		System.out.println(a);
	}
}
