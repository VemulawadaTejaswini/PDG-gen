import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int x = scan.nextInt();

        double max = 0;
	for(int i = 1; i <= x; i++){
	    double beki = 0;
	    int p;
	    for(p = 2; p < 10; p++){
		beki = Math.pow(i, p);
		if(beki > x){
		    break;
		}
	    }
	    if(max < Math.pow(i, p-1) && (p-1) != 1){
		max = Math.pow(i, p-1);
	    }
	    
	}

	System.out.println((int)max);
    }
}
