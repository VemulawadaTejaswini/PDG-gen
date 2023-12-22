import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int K=s.nextInt();
		int S=s.nextInt();
		int count=0;
		int i=0,j=0,k=0;
		
		for(i=K;i>=0;i--){
			for(j=K;j>=0;j--){
				for(k=K;k>=0;k--){
					if(i+j+k!=S)continue;
					else count++;
				}
			}
		}
		
		System.out.print(count);
	}

}
