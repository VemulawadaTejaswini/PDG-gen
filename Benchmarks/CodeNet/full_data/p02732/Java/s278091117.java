import java.util.*;
import java.lang.*;
public class Solution{
	
	
	public static final Scanner in =  new Scanner(System.in);
	public static void main(String args []){
		int n =in.nextInt();
		ArrayList m = new ArrayList();
		for(int i=0;i<n;i++){
			m.add(in.nextInt());	
		}
		
		for(int i=0;i<m.size();i++){
			int c = (int) m.get(i);
			m.remove(i);
			int count=0;
			int a = m.size();
			for(int j=0;j<a-1;j++){
				for(int k=j+1;k<a;k++){
					if((int) m.get(j)==(int) m.get(k)){
						count++;
					}
				}
			}
			m.add(i,c);
			System.out.println(count);
		}
		
	}
}
