import java.util.*;
import java.util.Vector;
import java.math.*; 
public class Main {
     Scanner sc = new Scanner(System.in);
	//	System.out.println( );
	
	
	
	void run(){ // kokonikaku
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		
		String s=sc.next();
		
		int l=s.length();
		List<Integer> ve1 = new ArrayList<Integer>();
		List<Integer> ve0 = new ArrayList<Integer>();
		if(s.charAt(0)=='0') ve1.add(0);
		
		for(int i=0;i<l;i++){
			if(i==0){
				if(s.charAt(i)=='0'){
					ve0.add(1);
				}
				else{
					ve1.add(1);
				}
			}
			else if(s.charAt(i-1)=='0' &&s.charAt(i)=='0'){
				ve0.set(ve0.size()-1,ve0.get(ve0.size()-1)+1);
			}
			
			else if(s.charAt(i-1)=='1' &&s.charAt(i)=='1'){
				ve1.set(ve1.size()-1,ve1.get(ve1.size()-1)+1);
			}
			
			else if(s.charAt(i-1)=='0' &&s.charAt(i)=='1'){
				ve1.add(1);
			}
			
			else if(s.charAt(i-1)=='1' &&s.charAt(i)=='0'){
				ve0.add(1);
			}
		}
		if(s.charAt(l-1)=='0')ve1.add(0);
		
		int g=ve0.size();
		
	//	System.out.println(ve0);
	//	System.out.println(ve1);
		
		int ans=0;
		
		List<Integer> rui1 = new ArrayList<Integer>();
		List<Integer> rui0 = new ArrayList<Integer>();
		
		rui0.add(0);
		rui1.add(0);
		for(int i=0;i<g;i++){
			rui0.add(rui0.get(i)+ve0.get(i));
		}
		
		for(int i=0;i<=g;i++){
			rui1.add(rui1.get(i)+ve1.get(i));
		}
		
		if(g<=k){
			ans=l;
		}
		else{
			for(int i=k;i<=g;i++){
				int t1=rui0.get(i)-rui0.get(i-k);
				int t2=rui1.get(i+1)-rui1.get(i-k);
				ans=Math.max(ans,t1+t2);
			}
		}
		System.out.println(ans);
	}

	
	public static void main(String[] args) {
		new Main().run();
        
    }
}