import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
       String s=sc.next();
	   String[] a=s.split("");
		int count1=0;
        int count0=0;

		for(int c=0;c<a.length;c++){
    		if(a[c].equals("0")){
            	count0++;
            }else{
             count1++;
            }
    	}
       int ans=a.length-Math.abs(count0-count1);
    
    	System.out.println(ans);
    }
}
