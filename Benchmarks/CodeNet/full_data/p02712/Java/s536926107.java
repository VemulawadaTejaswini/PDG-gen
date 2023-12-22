import java.util.*;

public class Main {
public static void main(String[] args) {
		
Scanner keyboard = new Scanner(System.in); 
		
int N= keyboard.nextInt();
int[] ans = new int[N+1]; 
		
for(int i = 1; i<N+1; i++){
    if(i%15 == 0){
    ans[i] ++;
    }
    if(i%5 == 0){
    ans[i] ++;
    }
    if(i%3 == 0){
    ans[i] ++;
    }
}
		
long sum = 0;

for(int j = 1; j<N+1; j++){
    if(ans[j] ==0){sum +=j;
    }
}

	System.out.println(sum);
	keyboard.close();	

	}
}
