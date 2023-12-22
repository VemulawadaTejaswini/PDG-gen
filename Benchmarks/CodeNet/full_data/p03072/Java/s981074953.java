import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
       	int A[] = new int[N];
    	int ans=0;
    	boolean check = false;
       	for(int i =0;i<N;i++){
       		A[i] = sc.nextInt();
       	}
    	for(int i =0;i<N;i++){
           check = true;
    		for(int j=0;j<i;j++){
    			

    			if(A[j]>A[i]){
    				check = false;

    			}

    			}
    		if(check = true ){
    			ans ++;
    		}

    	}
    	System.out.println(ans);

}

}
