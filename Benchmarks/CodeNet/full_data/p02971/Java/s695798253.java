import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp;
		int[] max = new int[2];
		max[0] = 0;
		max[1] = 0;
		int[] pos = new int[2];

		for(int i = 0 ; i < n ; i++){
			tmp = sc.nextInt();
			if(tmp > max[0]){
				max[1] = max[0];
				max[0] = tmp;
				pos[1] = pos[0];
				pos[0] = i;
			}else if(tmp > max[1]){
				max[1] = tmp;
				pos[1] = i;
			}
		}

		for(int i = 0 ; i < n ; i++){
			if(i == pos[0]){
				System.out.println(max[1]);
			}else{
				System.out.println(max[0]);
			}
		}
	}

}