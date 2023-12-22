import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		int n = sc.nextInt();
      	//int c[] = new int[n];
      	for(int i = 0; i < n; i++){
          array.add(sc.nextInt());
        }
      	
		int Noflag = 0;
		int loop = 1;
		for(int i = n-1; i>=1; i--) {
			loop = loop*i;
		}
		
		for(int l = 0; l < loop; l++) {
			Noflag = 0;
	      	for(int i = 0; i < n; i++) {
	      		if(i==0) {
	      			if((array.get(n-1)^array.get(i+1))!= array.get(i)) {
	      				Noflag = 1;
	      				break;
	      			}
	      		}else if(i==n-1) {
	      			if((array.get(i-1)^array.get(0))!= array.get(i)) {
	      				Noflag = 1;
	      				break;
	      			}
	      		}else if((array.get(i-1)^array.get(i+1))!= array.get(i)){
	      			Noflag = 1;
	      				break;
	      		}
	        }
	      	if(Noflag==0) {
	      		break;
	      	}
	      	Collections.shuffle(array);
		}
      	
      	
      	if(Noflag==1) {
      		System.out.println("No");
      	}else {
      		System.out.println("Yes");
      	}

	}

}