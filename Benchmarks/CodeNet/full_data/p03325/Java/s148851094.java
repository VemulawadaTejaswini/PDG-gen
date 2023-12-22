import java.util.Scanner;
public class B100c {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n,count;
	n = sc.nextInt();
	int a[] = new int[n];
	count = 0;
	for(int i = 0;i < n;i++){
	    a[i] = sc.nextInt();
	    while(a[i] % 2 == 0){
		a[i] /= 2;
		count++;
	    }
	}
	System.out.println(count);
    }
}
