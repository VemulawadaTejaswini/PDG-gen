import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] arr = new int[n];
		int num = 0;
		for(int i = 0;i<n;i++) {
			arr[i]=l+i;
			num+= arr[i];
		}
		int temp = arr[0];
		//System.out.println(temp);
		int close = temp;
		Arrays.sort(arr);
		for(int i = 1;i<n;i++) {
			if(temp<0&&arr[i]>temp) {
				temp = arr[i];
				close = temp;
			}else if(arr[i]==0) {
				close = 0;
				break;
			}else if(temp>0&&arr[i]>temp) {
				close = temp;
				break;
			}
		}
		System.out.println(num-close);

	}

}
