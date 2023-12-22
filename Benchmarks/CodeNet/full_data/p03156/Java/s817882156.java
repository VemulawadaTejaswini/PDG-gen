import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int count1=0,count2=0,count3=0;
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			ar.add(sc.nextInt());
		}
		for(int i=0;i<N;i++){
			if(ar.get(i)<=A){
				count1++;
			}
			else if(ar.get(i)>=A+1&&ar.get(i)<=B){
				count2++;
			}
			else{
				count3++;
			}
		}
		System.out.println(Math.min(count1, Math.min(count2, count3)));
	}

}
