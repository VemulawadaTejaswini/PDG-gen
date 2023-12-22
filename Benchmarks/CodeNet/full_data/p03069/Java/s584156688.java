import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String word = scan.next();
        int ans = 0;
        int flag =0;
        for(int i=0;i<n;i++){
        	if(word.substring(i,i+1).equals("#")){
                flag = i;
                break;
            }
        }
        for(int i=flag;i<n;i++){
        	if(word.substring(i,i+1).equals(".")){
            	ans++;
            }
        }
        if(ans > (n-flag)/2){
        	ans = n-flag-ans;
        }
        System.out.println(ans);
    }
}