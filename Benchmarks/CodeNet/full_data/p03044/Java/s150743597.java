import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] array = new int[n];
		for(int j=0;j<n;j++) {
			array[j]=3;
		}
		for(int i=0;i<n-1;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			if(c%2==0) {
				array[a-1]=0;
				array[b-1]=0;
			}else{
				if(array[a-1] ==3 && array[b-1] ==3) {
					array[a-1]=1;
					array[b-1]=1;
				}else if(array[a-1] ==0){
					array[b-1] =1;
				}else if(array[b-1] ==0){
					array[a-1]=1;
				}else if(array[a-1] ==1) {
					array[b-1] =0;
				}else {
					array[a-1] =0;
				}
			}
		}
		for(int l=0;l<n;l++) {
			System.out.println(array[l]);
		}
	}
}
