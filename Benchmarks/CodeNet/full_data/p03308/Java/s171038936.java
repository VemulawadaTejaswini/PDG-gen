import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d_set=sc.nextInt();
		int[] ary=new int[d_set];
		for(int i=0; i<d_set; i++) {
			ary[i]=sc.nextInt();
		}
		int min=114514810;
		int max=-114514810;
		int tmp1=0;
		int tmp2=0;
		for(int i=0; i<d_set; i++) {
			for(int j=i; j<d_set; j++) {
				if(ary[i]>ary[j]) {
					tmp1=ary[i];
					tmp2=ary[j];
					ary[i]=tmp2;
					ary[j]=tmp1;
				}
			}
		}
		System.out.println(Math.abs(ary[d_set-1]-ary[0]));
	}
}