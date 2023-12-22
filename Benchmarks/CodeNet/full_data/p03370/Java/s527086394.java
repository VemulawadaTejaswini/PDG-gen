import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int d_syurui = sc.nextInt();
		int komugi = sc.nextInt();
		int d_all=0;

		int[] donatu=new int[d_syurui];
		for(int i=0; i<d_syurui; i++){
			String source=sc.next();
				source=source.trim();
				donatu[i] = Integer.parseInt(source);
				d_all+=donatu[i];
		}

		int min=999999999;
		for(int i=0; i<d_syurui; i++){
			if(min>donatu[i]){
				min=donatu[i];
			}
			else{}
		}
		komugi=komugi-d_all;

		int d_kosu=d_syurui+komugi/min;

		System.out.println(d_kosu);

	}
}