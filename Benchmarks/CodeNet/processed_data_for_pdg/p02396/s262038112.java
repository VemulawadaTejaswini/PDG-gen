public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int i=0;
    	int n;
    	for(;;i++){
    		n=Integer.parseInt(sc.next());
    		if(n==0){
    			break;
    		}
    		System.out.println("Case "+(i+1)+": "+n);
    	}
    }
}
