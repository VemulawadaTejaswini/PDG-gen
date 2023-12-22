import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i=0;i<=ch.length-2;i++){
			if (ch[i]==83 && ch[i+1]==84){
				ch[i]=0;
				ch[i+1]=0;
			}
		}
		for (int i=0;i<ch.length;i++){
			if (ch[i]>0){
				count++;
			}
		}
		System.out.println(count);
	}

}