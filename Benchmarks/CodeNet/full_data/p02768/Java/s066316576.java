import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	int A = sc.nextInt();
	int B = sc.nextInt();

	int count = 0;
	for(int i=1;i<=N;i++){
	    if(i!=A && i!=B){
		//nCi
		double bunshi = 1;
		for(int k=N;k>=(N-i+1);k--) {bunshi =(bunshi*k)%(Math.pow(10,9)+7);}
		//System.out.println(bunshi);
		double bunbo = 1;
		for(int k=i;k>=1;k--) {bunbo = (bunbo*k)%(Math.pow(10,9)+7);}
		//System.out.println(bunbo);

		count += bunshi/bunbo;
	    }
	}
	//System.out.print(count%(Math.pow(10,9)+7));
	System.out.print(count);
    }
}
