import java.util.*;
import java.util.stream.Collectors;
 
 
public class Main {
    public static void main(String[] args) {
    	
        Scanner scanner=new Scanner(System.in);
        
        int N = scanner.nextInt();
        String s = scanner.next();
        
        int East = 0;
        int West = 0;
        
        for(int i=0;i<N;i++)
        	if(s.charAt(i)=='E')
        		East++;
        West = N - East;
        
        int ans = East;
        int count = East;
        
        for(int i=0;i<N;i++){
        	if(s.charAt(i)=='E')
        		count--;
        	//System.out.print(count);
        	if(0<i&&s.charAt(i-1)=='W')
        		count++;
        	//System.out.println(count);
        	if(count<ans)
        		ans = count;
        }
        
        System.out.println(ans);
 
 
    }
 
}
