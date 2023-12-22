import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        String s=sc.next();
   		String[] a=s.split("");
  		int ans=0;

		for(int c=0;c<a.length-1;c++){
    		if(a[c].equals("0")&&a[c+1].equals("0")){
              a[c+1]="1";
              ans++;
            }else if(a[c].equals("1")&&a[c+1].equals("1")){
              a[c+1]="0";
              ans++;
            }
    	}
  
    	System.out.println(ans);
    }
}
