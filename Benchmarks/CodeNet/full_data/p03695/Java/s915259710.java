import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int A = cin.nextInt();
		int tmp;
		int list[] = new int[8];
		Arrays.fill(list, 0);
		int target=0;
		for(int i=0;i<A;i++){
			tmp = cin.nextInt();
			if(tmp<3200){
				list[tmp/400]++;
			}else{
				target++;
			}
		}
		int min;
		int max;
		int type = 0;
		for(int j=0;j<=7;j++){
			if(list[j]>0)
			type++;
		}
		if(target==0){
			min=type;
			max=type;
		}else{
			if(type>0){
				min=type;
			}else{
				min=1;
			}
			if(type+target<8){
				max=type+target;
			}else{
				max=8;
			}
		}

		System.out.print(min);
		System.out.println(" "+max);
	}
}
