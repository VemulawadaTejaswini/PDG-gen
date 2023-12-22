import java.util.*;

class Main{
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] card = new int[N];
	for(int i = 0; i < N; i++){
	    card[i] = sc.nextInt();
	}
	Arrays.sort(card);

	int Alice = 0;
	int Bob = 0;
	for(int i = (N - 1); i >= 0; i -= 2){
	    Alice += card[i];
	}
	for(int i = (N - 2); i >= 0; i -= 2){
	    Bob += card[i];
	}
	System.out.print(Alice - Bob);
    }
}
