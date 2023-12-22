import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String word = scan.next();
        int ans = 0;
        for(int i=0;i<n-1;i++){
        	if(word.substring(i,i+2).equals("#.")){
            	ans++;
            }
        }
        System.out.println(ans);
    }
}