import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String word = scan.next();
        int ans = 0;
        int sh=0;
        int dot=0;
        int flag1 = 0;
        int flag2 = 0; 
        for(int i=0;i<n-1;i++){
        	if(word.substring(i,i+2).equals("#.")){
            	for(int j=i;j>=0;j--){
                	if(word.substring(j,j+1).equals("#") && flag1 == 0){
                    	sh++;
                    } else {
                    	flag1 = 1;
                    }
                }
                for(int j=i+1;j<n;j++){
                	if(word.substring(j,j+1).equals(".") && flag2 == 0){
                    	dot++;
                    } else {
                        flag2 = 1;
                    }
                }
            }
            if(sh > dot){
            	ans += dot;
            } else {
            	ans += sh;
            }
            dot = 0;
            sh = 0;
            flag1 =0;
            flag2 = 0;
        }
        System.out.println(ans);
    }
}