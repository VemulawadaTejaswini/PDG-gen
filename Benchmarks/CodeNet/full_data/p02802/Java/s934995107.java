import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int M=sc.nextInt();
	/*int p[]=new int[M];
	String S[]=new String[M];*/
	int pena=0;
	int AC=0;
	boolean flag[]=new boolean[N];
	for(int i=0;i<M;i++) {
	int p=sc.nextInt();
	String S=sc.next();
		if(S.equals("WA")) {
			if(!flag[p-1]) {
				pena++;
			}
		}else {
			if(!flag[p-1]) {
			flag[p-1]=true;
			AC++;}
		}

	}
	System.out.println(AC+" "+pena);


}
}