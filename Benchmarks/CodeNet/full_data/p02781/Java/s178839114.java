import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
		int k=sc.nextInt();
  		String[] s1=s.split("");
  		int[] n=new int[s.length()];
  
		for(int c=0;c<s.length();c++){
    		n[c]=Integer.parseInt(s1[c]);
    	}
  long ans=0;
  int leng=s.length();
    
  if(k==1){
    	ans+=(s.length()-1)*9;
      	ans+=n[0];
    }else if(k==2){
      if(s.length()>=3){
       ans+=(s.length()-1)*(s.length()-2)/2*9*9;
        ans+=9*(s.length()-1)*(n[0]-1);
        ans+=(leng-2)*9;
		ans+=n[1];
      }else{
      	ans+=n[1]+(n[0]-1)*9;
      }
  }
    	System.out.println(ans);
    }
}