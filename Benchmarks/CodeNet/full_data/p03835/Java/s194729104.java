import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int K=s.nextInt();
		int S=s.nextInt();
		int count=0;
		int i=0,j=0,k=0;
		
		for(i=0;i<=K;i++){
			for(j=0;j<=K;j++){
				for(k=0;k<=K;k++){
					if(i+j+k==S)count++;
				}
			}
		}
		
		System.out.print(count);

	}

}