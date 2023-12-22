
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sPeace = scan.nextInt();
		int cPeace = scan.nextInt();
		int sccCount = 0;
		
		for(int i = 0; i < 2000000; i++){
			if(sPeace > 0 && cPeace > 1 || cPeace >= 4){
				if(sPeace == 0){
					cPeace -= 2;
				}else{
					sPeace -= 1;
				}
			
				if(cPeace > 1){
					cPeace -= 2;
					sccCount++;
				}
			}
		}
		System.out.println(sccCount);

	}

}
