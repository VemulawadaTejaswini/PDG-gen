import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int S = in.nextInt();
		int count=0;
		int Xnumber=0;
		int Ynumber=0;
		int Znumber=0;
		for(int i=0;i<K+1;i++){
			Xnumber=i;
			if(Xnumber==S){count++;continue;}
			for(int j=0;j<K+1;j++){
				if(S-Xnumber>2*K)break;
				Ynumber=j;
				if(Xnumber+Ynumber==S){count++;continue;}
				for(int n=0;n<K+1;n++){
					if(S-Xnumber-Ynumber>K)break;
					Znumber=n;
					if(Xnumber+Ynumber+Znumber==S){count++;continue;}
				}
			}
		}
		System.out.println(count);
		in.close();
		
	}
}
