import java.util.*;

import java.math.*; 
public class Main {
     Scanner sc = new Scanner(System.in);
	
	
	void run(){ // kokonikaku
		int a[] = new int[5];
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		
		int ans=0;
		for(int i=0;i<5;i++){
			int y=0;
			 y=a[i];
			if(y%10>0)y+=10;
			y=y/10*10;
			ans+=y;
		}
		int sa=0;
		for(int i=0;i<5;i++){
			int y=a[i];
			if(y%10==0) continue;
			sa=Math.max(sa,10-y%10);
		}
		
			System.out.println(ans-sa);
		
		
		
    
	}

	
	public static void main(String[] args) {
		new Main().run();
        
    }
}