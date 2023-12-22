import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		int zero[] = new int[101];
		int one[] = new int[101];
		int two[] = new int[101];
        zero[0] = 0;
        one[0] = 0;
        two[0] = 0;
        for(int i=1; i<=100; i++){
          zero[i] = i;
          one[i] = i*100;
          two[i] = i*10000;
        }
        if(d==0){
		System.out.println(zero[n]);
        }
        if(d==1){
		System.out.println(one[n]);
        }
        if(d==2){
		System.out.println(two[n]);
        }
	}
}