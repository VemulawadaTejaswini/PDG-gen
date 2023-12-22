import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String word = scan.next();
        int ans = 0;
        int sh=0;
        int dot=0;
        int[] dots = new int[n];
        for(int i=0;i<n;i++){
        	if(word.substring(i,i+1).equals(".")){
            	dot++;
            }
        }
        dots[0] = dot;
        for(int i=1;i<n;i++){
        	if(word.substring(i-1,i).equals(".")){
            	dots[i] = dots[i-1]-1;
            } else {
            	dots[i] = dots[i-1];
            }
        }
        for(int i=0;i<n-1;i++){
        	if(word.substring(i,i+2).equals("#.")){
            	for(int j=i;j>=0;j--){
                	if(word.substring(j,j+1).equals("#")){
                    	sh++;
                    } else {
                    	break;
                    }
                }
            }
            if(sh > dots[i]){
            	ans += dots[i];
            } else {
            	ans += sh;
            }
            sh = 0;
        }
        System.out.println(ans);
    }
}