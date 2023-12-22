import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer cnt = 0;
      	for(int i = 0; i < N; i++){
        	if(i.toString().length()%2==1){
            	cnt++;
            }
        }
		System.out.println(cnt);
	}
}