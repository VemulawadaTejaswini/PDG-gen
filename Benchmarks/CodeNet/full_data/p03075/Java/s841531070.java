import java.util.*;

import java.math.*; 
public class Main {
     Scanner sc = new Scanner(System.in);
	
	
	void run(){ // kokonikaku
		int a[] = new int[5];
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		
		int e=0;
		for(int i=0;i<1;i++){
			if(a[i+4]-a[i]>k)e=1;
		}
		if(e==1){
			System.out.println(":(");
		}
			else{
			System.out.println("Yay!");
				
			}
		
    
	}

	
	public static void main(String[] args) {
		new Main().run();
        
    }
}