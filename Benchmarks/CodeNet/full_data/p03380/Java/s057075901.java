import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=0; i<n; i++){
			if(a[i]>max)max = a[i];
		}
		int r = a[0];
		if(max%2 == 0){
			for(int j=0; j<n; j++){
				if(Math.abs(max/2 - a[j])<=Math.abs(max/2 - r) && a[j]<max)r = a[j];
			}
		}
		else{
			for(int j=0; j<n;j++){
				if(Math.min(Math.abs((max-1)/2 - a[j]),Math.abs((max+1)/2 - a[j]))<=Math.min(Math.abs((max-1)/2 - r),Math.abs((max+1)/2 - r)) && a[j]<max)r = a[j];
			}
		}
		System.out.println(max + " " + r);
	}
}