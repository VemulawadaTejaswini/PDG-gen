import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		String a[]=S.split("");
		int N=a.length;
		int b[]=new int[N];
		int all=0;
		int count=0;
		for(int i=0;i<N;i++){
			b[i]=Integer.parseInt(a[i]);
		}
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++){
				all=0;
				for(int z=i;z<=j;z++){
					all+=b[z]*(Math.pow(10,(j-z)));
				}
				if(all%2019==0){
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
