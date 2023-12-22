import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        long luca[]=new long [87];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        luca[0]=2;
        luca[1]=1;
        for (int i = 2; i < luca.length; i++) {
		    luca[i]=luca[i-1]+luca[i-2];
		}
        System.err.println(luca[n]);
	}

}
