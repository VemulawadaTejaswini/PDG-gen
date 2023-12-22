import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int hairetsu_ookisa = sc.nextInt();
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String res;
		int[] hairetsu;
		int[] hairetsu_2;
		int[] hairetsu_3;
		int toori=0;
		long wa1=0;
		long wa2=0;
		long wa=0;
		int counter=4;
		StringTokenizer stoken;

		//res = bfr.readLine();
		hairetsu=new int[hairetsu_ookisa];
		hairetsu_2=new int[hairetsu_ookisa-1];
		hairetsu_3=new int[hairetsu_ookisa-2];
		//stoken=new StringTokenizer(res," ");

		for(int i=0; i<hairetsu_ookisa;   i++){
			//hairetsu[i]=Integer.parseInt(stoken.nextToken());
			hairetsu[i]=sc.nextInt();
		}



		for(int i=0; i<hairetsu_ookisa-2;  i++){
			hairetsu_2[i]=hairetsu[i]+hairetsu[i+1];
			hairetsu_3[i]=hairetsu[i]+hairetsu[i+1]+hairetsu[i+2];
			if(hairetsu_2[i]==0){toori++;}
			if(hairetsu_3[i]==0){toori++;}
		}
		hairetsu_2[hairetsu_ookisa-2]=hairetsu[hairetsu_ookisa-2]+hairetsu[hairetsu_ookisa-1];
		if(hairetsu_2[hairetsu_ookisa-2]==0){toori++;}

		System.out.println("2 3 ="+toori);

		for(int p=counter; p<=hairetsu_ookisa; p=p+2){
			if(counter%2==0 && counter<=hairetsu_ookisa){
				for(int k=0; k<hairetsu_ookisa-counter+1; k++){
					for(int j=0; j<(counter/2); j++){
						wa1+=hairetsu_2[k+j*2];
					}
					if(wa1==0){toori++;wa1=0;}else{wa1=0;}
				}
				//System.out.println("~"+counter+" "+toori);
				counter++;

			}

			if(counter%2==1 && counter<=hairetsu_ookisa){
				for(int k=0; k<hairetsu_ookisa-counter; k++){
					for(int j=0; j<(counter+1)/2; j++){
						wa2+=hairetsu_2[k+j*2];
					}
					wa2+=hairetsu_3[k+(counter+1)/2];
					if(wa2==0){toori++;wa2=0;}else{wa2=0;}
				}
				//System.out.println("~"+counter+" "+toori);
				counter++;
			}
		}

		System.out.println(""+toori);
	}
}
