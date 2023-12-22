import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int K = sc.nextInt();
	int count = 0;
	for(int a=1;a<=K;a++){
	    for(int b=1;b<=K;b++){
		for(int c=1;c<=K;c++){
		    for(int L=Math.max(Math.max(a,b),c); L>=1;L--){
			if(a%L==0 && b%L==0 && c%L==0){
			    count += L;
			    break;
			}
		    }
		}
	    }
	}
	System.out.print(count);
    }
}
