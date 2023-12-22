import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int p[] = new int[m];
        String s[] = new String[m];
        for(int i = 0; i < m; i++){
        	p[i] = sc.nextInt();
            s[i] = sc.next();
        }
        int ac = 0;
        int wa = 0;
        for(int i = 0; i < m; i++){
            int count = 0;
            for(int j = i - 1; j >= 0; j--){
        		if(p[i] == p[j] && s[j].equals("AC")){
                	count++;
                    break;
                }
            }
            if(count == 0 && s[i].equals("AC")){
            	ac++;	
            }else if(count == 0 && s[i].equals("WA")){
            	wa++;
            }
        }
        System.out.println(ac + " " + wa);
    }
} 