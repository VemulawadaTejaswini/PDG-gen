import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  		int[] p=new int[n];
    for(int c=0;c<n;c++){
    p[c]=sc.nextInt();
    }
    int c=0;
    
  for(int d=0; d<n; d++){
    for(int e=0; e<=d; e++){
     if(p[e]<p[d]){
       c++;
       break;
     }
    }
     
  }
  	
    System.out.println(n-c);
    
    
   
    }
}