import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
  
  		int[] p=new int[m];
        String[] s=new String[m];
  
  		for(int a=0;a<m;a++){
        p[a]=sc.nextInt();
        s[a]=sc.next();
        }
 	 
  		int ac=0;
  		int wa=0;
  		int c=0;
        int[] w=new int[n];
  
     for(int c1=1; c1<n+1; c1++){
      for(int c2=0;c2<m;c2++){
      if(p[c2]==c1){
        c++;
      }
      if(p[c2]==c1&&s[c2].equals("WA")){
       w[c1-1]+=1;
      }else if(p[c2]==c1&&s[c2].equals("AC")){
       ac++;
       break;
      }
      }
      if(c==w[c1-1]){
      	w[c1-1]=0;
      }  
      wa+=w[c1-1];
      c=0;
      
     }
  
  		  System.out.println(ac);
    	  System.out.println(wa);
}
}