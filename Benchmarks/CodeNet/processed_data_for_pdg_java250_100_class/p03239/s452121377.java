public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int N;   
	int T;   
	N = scan.nextInt();
	T = scan.nextInt();
	int[] c = new int[N];   
	int[] t = new int[N];   
	for(int i = 0; i < N; i++){
	    c[i] = scan.nextInt();
	    t[i] = scan.nextInt();
	}
	int min = 1001;   
	for(int i = 0; i < N; i++){
	    if(t[i] <= T){
		if(c[i] < min){
		    min = c[i];
		}
	    }
	}
	if(min < 1001){
	    System.out.println(min);
	}else{
	    System.out.println("TLE");
	}
    }
}
