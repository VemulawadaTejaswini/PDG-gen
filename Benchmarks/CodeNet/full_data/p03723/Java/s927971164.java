import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		int count = 0;
		boolean end  = false;
		for (int i=0;i<arr.length;i++){
			if (arr[i]%2==1){
				System.out.println(count);
				return ;
			}
		}
		while(!end){
			int[] tmp = new int[3];
			count++;
			tmp[0] = arr[1]/2 + arr[2]/2;
			tmp[1] = arr[0]/2 + arr[2]/2;
			tmp[2] = arr[0]/2 + arr[1]/2;
			if (tmp[0]==tmp[1]&&tmp[1]==tmp[2]){
				System.out.println(-1);
				return;
			}
			else if (tmp[0]/2==1 ||tmp[1]/2==1||tmp[2]/2==1){
				System.out.println(count);
				return;
			}
			else{
				arr = tmp;
			}
		}
	}

}