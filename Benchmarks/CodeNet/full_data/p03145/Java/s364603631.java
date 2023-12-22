import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int hen[] = new int[3];
		int hen[0] = sc.nextInt();
		int hen[1] = sc.nextInt();
		int hen[2] = sc.nextInt():
		
		int temp;
        for(int k = 0; k < N; k++){
            for(int l = 0; l< N-k-1; l++){
               if(hen[l] > hen[l + 1]){
                    	temp = hen[l];
                    	hen[l] = hen[l + 1];
                    	hen[l + 1] = temp;
               	}
            }
        }
		System.out.println(hen[0]*hen[1]/2);
		
    }
}