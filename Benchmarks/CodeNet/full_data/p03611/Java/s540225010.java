import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int size = 100000;
		int len = sc.nextInt();
        int[] num;
        num = new int[len];
        int[] box;
        box = new int[size];
        int i;
        int max=0;
        for(i = 0;i < size ;i++) box[i] = 0;
        for(i = 0;i < len ;i++)num[i] = sc.nextInt();
        for(int n : num){
            if(n!=0) box[n-1]++;
            box[n]++;
            box[n+1]++;
        }
        for(int b : box){
            if(max < b) max = b;
        }
        System.out.println(max);
	}
}