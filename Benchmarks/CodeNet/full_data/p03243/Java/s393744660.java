import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int re=0;
	if(N<=111) re=111;
	else if(N<=222) re=222;
	else if(N<=333) re=333;
	else if(N<=444) re=444;
	else if(N<=555) re=555;
	else if(N<=666) re=666;
	else if(N<=777) re=777;
	else if(N<=888) re=888;
	else re=999;
	System.out.print(re);
    }
}
