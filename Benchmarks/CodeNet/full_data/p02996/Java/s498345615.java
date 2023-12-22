import java.util.*;
class Main{
	public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int max = 0;
		int sum = 0;
		for(int x = 0; x < n; x++){
			a[x] = sc.nextInt();
			b[x] = sc.nextInt();
			if(max < b[x]){
				max = b[x];
			}
			sum = sum + a[x];
		}
		if(sum <= max){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
    }
}