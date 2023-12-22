public class Main{
	
	

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);

	int R,G,B,N;
    R=sc.nextInt();
    G=sc.nextInt();
    B=sc.nextInt();
    N=sc.nextInt();
    int count=0;
    for(int a=0;a<=N;a++) {
    	for(int b=0;b<=N-a*R;b++) {
    		int c=N-a*R-b*G;
    		if(c<0) {
    			break;
    		}else if(c%B==0) {
    			count++;
    		}
    		
    	}
    }
    System.out.println(count);
	

		
	}
	

	
}
	