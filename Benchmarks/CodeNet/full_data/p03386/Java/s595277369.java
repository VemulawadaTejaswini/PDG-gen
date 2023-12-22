import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n3; i++){
        	ans.add(n1);
            n1++;
        }
        for(int i = 0; i < n3; i++){
        	ans.add(n2);
            n2--;
        }
        Collections.sort(ans);
        for(int i = 0; i < ans.size() - 1; i++){
        	if(ans.get(i) == ans.get(i + 1)){
            	ans.remove(i);
            }
        }
        for(int i = 0; i < ans.size(); i++){
        	System.out.println(ans.get(i));
        }
    }
}