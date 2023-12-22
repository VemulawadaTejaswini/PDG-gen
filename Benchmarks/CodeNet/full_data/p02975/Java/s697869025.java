import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int c[] = new int[n];
      	for(int i = 0; i < n; i++){
          c[i] = sc.nextInt();
        }
		int Noflag = 0;
      	for(int i = 0; i < n; i++) {
      		if(i==0) {
      			if((c[n-1]^c[i+1])!=c[i]) {
      				Noflag = 1;
      				break;
      			}
      		}else if(i==n-1) {
      			if((c[i-1]^c[0])!=c[i]) {
      				Noflag = 1;
      				break;
      			}
      		}else if((c[i-1]^c[i+1])!=c[i]){
      			Noflag = 1;
      			break;
      		}
        }

      	if(Noflag==1) {
      		System.out.println("No");
      	}else {
      		System.out.println("Yes");
      	}

	}

}