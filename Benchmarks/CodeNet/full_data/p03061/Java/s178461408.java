import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int[] a = new int[n];
	int[] gcd = new int[n];
	int[] gcd2 = new int[n];

	for(int i = 0; i < n; i++){
	    a[i] = scan.nextInt();
	}

	int count = 0;
	int gcd[0] = a[0];
	for(int i = 1; i < n; i++){
	    int tmp = koyaku(gcd[i-1], a[i]);  //最大公約数
	    //最大公約数が1
	    if(tmp == 1 && i <= n-2){
		//その次の最大公約数も1
		if(koyaku(a[i], a[i+1]) == 1){
		    gcd[i] = koyaku(gcd[i-1], a[i+1]);
		    gcd[i+i] = koyaku(gcd[i-1], a[i+1]);
		}
		//その次の最大公約数 != 1
		else{
		    gcd[i] = koyaku(a[i], a[i+1]);
		    gcd[i+1] = koyaku(a[i], a[i+1]);
		    gcd[i-1] = koyaku(a[i], a[i+1]);
		}
		i++;
		count++;
	    }
	}

	if(count >= 2){
	    System.out.println(1);
	}else if(count == 1){
	    System.out.println(gcd[n-1]);
	}else{
	    //前準備
	    for(int i = 0; i < n; i++){
		gcd2[i] = a[i] / gcd[n-1];
	    }
	    
	    int count2 = 0;
	    for(int i = 1; i < n; i++){
		int tmp = koyaku(gcd2[i-1], gcd2[i]);  //最大公約数
		//最大公約数が1
		if(tmp == 1 && i <= n-2){
		    //その次の最大公約数も1
		    if(koyaku(gcd2[i], gcd2[i+1]) == 1){
			gcd2[i] = koyaku(gcd2[i-1], gcd2[i+1]);
			gcd2[i+1] = koyaku(gcd2[i-1], gcd2[i+1]);
		    }
		    //その次の最大公約数 != 1
		    else{
			int hoge = koyaku(gcd2[i], gcd2[i+1]);
			gcd2[i] = hoge;
			gcd2[i+1] = hoge;
			gcd2[i-1] = hoge;
		    }
		    i++;
		    count2++;
		}
	    }

	    if(count >= 2){
		System.out.println(gcd[n-1]);
	    }else if(count == 1){
		System.out.println(gcd[n-1]*gcd2[n-1]);
	    }
	}
	
    }
    
    static int koyaku(int a, int b){
	if(a < b){
	    int tmp = a;
	    a = b;
	    b = tmp;
	}

	while(b != 0){
	    int tmp = a % b;
	    a = a/b;
	    b = tmp;
	}

	return a;
    }
}

