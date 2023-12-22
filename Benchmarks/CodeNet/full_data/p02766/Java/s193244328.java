import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int r;
	    int count = 1;
	    r = n / k;
	    while(r != 0){
	        count ++;
	        r = r / k;
        }
        System.out.println(count);
    }
}