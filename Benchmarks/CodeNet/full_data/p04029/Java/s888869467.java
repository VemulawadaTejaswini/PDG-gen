import java.util.*
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int N = Integer.parseInt(str);
        
        int ans = (1 + N)*N/2;
        System.out.println(ans);
    }
}