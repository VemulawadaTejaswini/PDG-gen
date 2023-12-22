import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

  	int[] p=new int[n];
   for(int c=0;c<n;c++){
    		p[c]=sc.nextInt();
    	}
    int[] q=new int[n];
   for(int c=0;c<n;c++){
    		q[c]=sc.nextInt();
    	}
    int pans=0;
  	int qans=0;
  
 	for(int c=0;c<n-1;c++){
      int pans2 =p[c]-1;
      for(int d=1;d<n-c;d++){
        pans2*=d; 
     }
      pans+=pans2;
      pans2=0;
      
      for(int e=0;e<=c;e++){
       if(p[e]<p[c+1]){
         p[c+1]-=1;
        }
      }
      
      }
      
    
  
   for(int c=0;c<n-1;c++){
      int qans2 =q[c]-1;
      for(int d=1;d<n-c;d++){
        qans2*=d;
     }
      qans+=qans2;
      qans2=0;
     
     for(int e=0;e<=c;e++){
       if(q[e]<q[c+1]){
         q[c+1]-=1;
        }
      }
    }
   
    int max=Math.max(pans,qans);
  	int min=Math.min(pans,qans);
  
    	System.out.println(max-min);
    }
}

