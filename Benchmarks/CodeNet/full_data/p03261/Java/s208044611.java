import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	String[] w = new String[n];
	w[0] = scan.next();
	int flag = 1;
	for(int i = 1; i < n; i++){
	    w[i] = scan.next();
	    if(w[i].charAt(0) !=
	       w[i-1].charAt(w[i-1].length()-1)){
		flag = -1;
	    }
	}

	if(flag == 1){
	    for(int i = 0; i < n; i++){
		for(int j = i-1; j >= 0; j--){
		    if(w[i].equals(w[j])){
			flag = -1;
		    }
		}
	    }
	}

	if(flag == 1){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
