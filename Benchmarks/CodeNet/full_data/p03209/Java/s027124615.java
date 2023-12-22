import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	long n = sc.nextLong();
	long x = sc.nextLong();

	// 出力
	System.out.println(p(n,x));
    }

    private static long p(long n, long x){
	if(n == 0){
	    return 1;
	}

	long len_n1 = 4;
	for (long i = 1; i <= n-1; i++){
	    len_n1 *= 2;
	}
	len_n1 -= 3;

	if(x == 1){
	    return 0;
	}else if(x >= 2 && x <= 1 + len_n1){
	    return p(n -1, x -1);
	}else if(x == 2 + len_n1){
	    return p(n -1, len_n1) + 1;
	}else if(x >= 3 + len_n1 && x <= 2 + 2 * len_n1){
	    return p(n -1, len_n1) + 1 + p(n -1, x - len_n1 - 2);
	}else{
	    return p(n -1, len_n1) * 2 + 1;
	}
    }
}
