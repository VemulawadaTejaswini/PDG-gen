import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String g[] = new String[10000];

		for(int i=0; i<10000; i++){
			if(i<5000)g[i] = ".";
			else g[i] = "#";
		}
		
		for(int j=0; j<10; j++){
			for(int i=j*200; i<50+50*j && i<b*2; i=i+2){ 
				g[i] = "#"; 
			}
		}
		for(int i=0; i<10;i++){	
			for(int j=5100+i*200; j<5150+50*i && j<5100+a*2; j=j+2){
				g[j] = ".";
			}
		}

		System.out.println("100 100");
		for(int k=0; k<10000; k++){
			if(k%100==99)System.out.println(g[k]);
			else System.out.print(g[k]);
		}
	}
}