import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		
		int[]list  = new int[N];
		int all = 0;
		for(int i=0; i<N; i++){
			list[i] = sc.nextInt();
			all += list[i];
}
	if(H<=all){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
}
}
