import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	int N =nextInt();
	int K =nextInt();
	int X =nextInt();
	int Y =nextInt();
	if(N<=K){
	System.out.println(N*X);
	}else if(N>K){
	System.out.println(K*X+(N-K)*Y);
	}
	}
	}