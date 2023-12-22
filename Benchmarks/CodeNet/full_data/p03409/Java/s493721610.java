import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	//変数宣言
	int N = scan.nextInt();
	int[] a = new int[N];
	int[] b = new int[N];
	int[] c = new int[N];
	int[] d = new int[N];
	int[] flag = new int[N];
	int count = 0;

	//値入力
	for(int i = 0; i < N; i++){
	    a[i] = scan.nextInt();
	    b[i] = scan.nextInt();
	}
	for(int i = 0; i < N; i++){
	    c[i] = scan.nextInt();
	    d[i] = scan.nextInt();
	}
	for(int i = 0; i < N; i++){
	    flag[i] = 0;
	}

	//ソート処理
	for(int i = 0; i < N-1; i++){
	    for(int j = i+1; j < N; j++){
		if(a[i] > a[j]){
		    int tmp1 = a[i];
		    a[i] = a[j];
		    a[j] = tmp1;
		    int tmp2 = b[i];
		    b[i] = b[j];
		    b[j] = tmp2;
		}
	    }
	}
	for(int i = 0; i < N-1; i++){
	    for(int j = i+1; j < N; j++){
		if(c[i] > c[j]){
		    int tmp1 = c[i];
		    c[i] = c[j];
		    c[j] = tmp1;
		    int tmp2 = d[i];
		    d[i] = d[j];
		    d[j] = tmp2;
		}
	    }
	}

	//貪欲法	
	for(int i = 0; i < N; i++){
	    int max = -1;
	    int index = -1;
	    for(int j = N-1; j >= 0; j--){
		if(c[i] > a[j] && d[i] > b[j]){
		    if(max < b[j] && flag[j] == 0){
			max = b[j];
			index = j;
		    }
		}
	    }
	    if(index != -1){
		flag[index] = 1;
		count++;
	    }
	}

	System.out.println(count);
    }
}