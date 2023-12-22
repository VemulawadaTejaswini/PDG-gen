import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a;
		int[] b;
        a = new int[10001];
		b = new int[10001];
		for(int s = 0; s < 10000; s++){
			a[s] = 0;
			b[s] = 0;
		}
        int tmp;
        int count = 0;
        for(int i = 0; i < num; i++){
            tmp = sc.nextInt();
			if(tmp < 10000){
				a[tmp] = (a[tmp] + 1) % 2; 
			}else{
				tmp = tmp /10000;
				b[tmp] = (b[tmp] + 1) % 2; 
			}
        }
		for(int j = 0; j < 10000; j++){
			if(a[j] == 1) count++;
			if(b[j] == 1) count++;
		}
        System.out.print(count);
	}
}