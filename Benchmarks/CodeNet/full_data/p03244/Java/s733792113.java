

import java.util.*;

class Main {
  public static void main (String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    int odd[] = new int[100001];
    int even[] = new int[100001];

    
    
    for (int i=0; i<n/2;i++){
      odd[scan.nextInt()]++;
      even[scan.nextInt()]++;
      }
    
    int omc=0;
    int omc2=0;
    int om =0;
    
    int emc=0;
    int emc2=0;
    int em =0;
    
    int otmp = 0;
    int etmp=0;
    
      
     
    for (int i=0; i<100001; i++){
        if(odd[i]!=0){
             otmp =odd[i];
             if(otmp>omc){
            	 omc2=omc;
            	 omc=otmp;
            	 om=i;
             }
        }
     }
    
    for (int i=0; i<100001; i++){
        if(even[i]!=0){
             etmp =even[i];
             if(etmp>emc){
            	 emc2=emc;
            	 emc=etmp;
            	 em=i;
             }
        }
     }
    
    int oans=n/2-omc;
    int eans=n/2-emc;
    
    int ans=0;
    
    if(om==em){
    	if(oans==0 && eans==0){
    		ans=n/2;
    	}else{
    		ans = Math.min(oans+n/2-emc2, n/2-omc2+eans);
    	}
    }else{
    	ans = oans+eans;
    }
   

      System.out.println(ans);
  }
 
}
