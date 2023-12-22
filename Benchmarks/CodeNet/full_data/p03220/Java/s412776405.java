import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int min = 0;
		int minnumber = 0;		
		int kouho = sc.nextInt();
		int kion = sc.nextInt();
		int kion2 = sc.nextInt();
		int kion3 = 0;		
		int temp = 0;
		
		for(int i = 0;i < kouho;i++) {			
			temp =sc.nextInt();
			list.add(temp);
		}
		
		for(int j = 0; j<kouho;j++) {
			kion3 = (int) (kion - (list.get(j)) * 0.006);
			if(j==0) {
				min = Math.abs(kion2-kion3);
				minnumber = j;
			}else {
				if(min > Math.abs((kion2-kion3))) {					
					minnumber  = j;
				}
			}
		}		
		System.out.println(minnumber+1);
	}
}