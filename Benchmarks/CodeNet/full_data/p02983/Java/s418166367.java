import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		sc.close();

		int min=2019;

		if(L<=2019 && R>=2019){
			min=0;
		}else{
			for(int i=L;i<=R-1;i++){
				for(int j=L+1;j<=R;j++){
					min=Math.min(min, (i*j)%2019);
				}
			}
		}

		System.out.println(min);
	}

}
