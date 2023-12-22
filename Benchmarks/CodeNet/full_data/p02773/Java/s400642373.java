import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        String s[] = new String[n];
        int count[] = new int[n];
        for(int i = 0; i < n; i++){
        	s[i] = sc.next();
            count[i] = 0;
        }
        Arrays.sort(s);
        int max = 0;
        for(int i = 0; i < n - 1; i++){
        	for(int j = i; j < n; j++){
            	if(s[i].equals(s[j])){
                	count[i]++;
                }else{
                	break;
                }
            }
            max = Math.max(max, count[i]);
            i += count[i];
        }
        for(int i = 0; i < n; i++){
        	if(max == count[i]){
            	System.out.println(s[i]);
            }
        }
    }
}