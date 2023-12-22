import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int abc[]=new int[3];
		for(int i=0;i<3;i++)abc[i]=scan.nextInt();
		scan.close();
		int cnt=0;
		Arrays.sort(abc);
		cnt = (abc[2]-abc[1]);
		cnt += ((abc[2]-(abc[0] + cnt))%2==0)?  (abc[2]-(abc[0] + cnt))/2 : (abc[2]-(abc[0] + cnt))/2+1;
		System.out.println(cnt);
	}
}