import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int t = sc.nextInt();
        int a[];
        int maxa = 0;
        int maxi = 0;
        a = new int[t];
        for(int i = 0; i<t; i++){
		a[i] = sc.nextInt();
        if(maxa < a[i]){
            maxa = a[i];
            maxi = i;
        }
        }
        int toai = k - a[maxi];
        int answer = 0;
        if(maxa <= toai){
            System.out.println(answer);
        }
        else{
            answer = k - toai + 1;
            System.out.println(answer);
        }
	}
}