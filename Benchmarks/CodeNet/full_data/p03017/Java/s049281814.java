import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int su = sc.nextInt();
        int fu = sc.nextInt();
        int sgoal = sc.nextInt();
        int fgoal = sc.nextInt();
        char[] masu = sc.next().toCharArray();
        if(sgoal < fgoal){
        	System.out.println("Yes");
            return;
        }else{
        	for(int i = su; i <= fgoal; i++){
            	if(i >= 2){
                	if(masu[i] == '.' && masu[i - 1] == '.' && masu[i - 2] == '.'){
                    	System.out.println("Yes");
                        return;
                    }
                }
            }
            System.out.println("No");
        }
	}
}