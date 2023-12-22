import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();
		int[] kgmmc=new int[kosu];

		for(int i=0; i<kosu; i++){
			kgmmc[i]=sc.nextInt();
		}

		int tmp1=0;
		int tmp2=0;

		for(int i=0; i<kosu; i++){
			for(int j=i; j<kosu; j++){
				if(kgmmc[i]<kgmmc[j]){
					tmp1=kgmmc[i];
					tmp2=kgmmc[j];
					kgmmc[i]=tmp2;
					kgmmc[j]=tmp1;
				}
			}
		}

		int dansu=1;
		int ookisa=kgmmc[0];
		for(int i=0; i<kosu; i++){
			if(kgmmc[i]<ookisa){
				dansu++;
				ookisa=kgmmc[i];
			}
		}

		System.out.println(dansu);
	}
}