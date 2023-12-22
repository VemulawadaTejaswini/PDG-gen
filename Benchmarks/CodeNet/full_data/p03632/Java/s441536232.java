import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();
	int diff = 0;
	
	/* aliceが早い */
	if(a < c){
	    diff = Math.min(b-c,d-c);
	}
	/* bobが早い */
	else if(c < a){
	    diff = Math.min(b-a,d-a);
	}
	/* 同時に押した */
	else{
	    diff = Math.min(b,d)-a;
	}

	if(diff < 0){
	    System.out.println(0);
	}else{
	    System.out.println(diff);
	}
    }
}
