import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int a = cin.nextInt();
		int b = cin.nextInt();
		int x = cin.nextInt();
		int y = cin.nextInt();

		int len_x=Math.abs(x-a);
		int len_y=Math.abs(y-b);
		char hor,ver,hor_,ver_,hor_1,hor_2,ver_1,ver_2;
		if(a<x){
			hor_1 = 'R';
			hor_2 = 'L';
		}else{
			hor_1 = 'L';
			hor_2 = 'R';
		}

		if(b<y){
			ver_1='U';
			ver_2='D';
		}else{
			ver_1='D';
			ver_2='U';
		}

		for(int i=0;i<=3;i++){
			if(i%2==0){
				hor = hor_1;
				hor_ = hor_2;
				ver = ver_1;
				ver_ = ver_2;

			}else{
				hor = hor_2;
				hor_ = hor_1;
				ver = ver_2;
				ver_ = ver_1;
			}
			for(int o1=0;o1<i;o1++){
				System.out.println(hor_);
			}
			for(int j=1;j<=len_x+(i/2);j++){
				System.out.println(hor);
			}
			for(int k=1;k<=len_y+(i/2);k++){
				System.out.println(ver);
			}
			for(int o2=0;o2<i;o2++){
				System.out.println(ver_);
			}
		}
		System.out.println("");
	}
}
