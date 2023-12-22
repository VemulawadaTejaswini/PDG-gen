import java.util.*;

public class SumofThreeIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int K=s.nextInt();
		int S=s.nextInt();
		int count=6;
		int i=0,j=0,k=0;
		
		for(i=1;i<=K;i++){
			for(j=1;j<=K;j++){
				for(k=1;k<=K;k++){
					if(i+j+k==S)count++;
				}
			}
		}
		
		System.out.print(count);

	}

}