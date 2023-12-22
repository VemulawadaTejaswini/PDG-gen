import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int M=sc.nextInt();
	int pena=0;
	int AC=0;
	boolean flag[]=new boolean[N];
	int pena2[]=new int[N];
	for(int i=0;i<M;i++) {
	int p=sc.nextInt();
	String S=sc.next();
		if(S.equals("WA")) {
			if(!flag[p-1]) {
				pena2[p-1]++;
			}
		}else {
			if(!flag[p-1]) {
			flag[p-1]=true;
			pena+=pena2[p-1];
			AC++;}
		}

	}
	System.out.println(AC+" "+pena);


}
}