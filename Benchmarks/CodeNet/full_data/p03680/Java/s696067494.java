import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int[] a = new int[n];
	for(int i = 0; i < n; i++){
	    a[i] = scan.nextInt();
	}

	int i = 0;
	int count = 1;
	while(true){
	    int tmp = i;
	    i = a[i]-1;
	    a[tmp] = -1;
	    count++;
	    if(a[i] == 2){
		break;
	    }else if(a[i] == -1){
		break;
	    }
	}

	if(a[i] == -1){
	    System.out.println(-1);
	}else{
	    System.out.println(count);
	}
    }
}
