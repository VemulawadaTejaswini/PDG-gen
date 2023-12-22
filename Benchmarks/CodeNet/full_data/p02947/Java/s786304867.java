import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	long ans=0;

  		char[][] ch=new char[n][10];
  		String[] s=new String[n];
		for(int c=0;c<n;c++){
    		ch[c]=sc.next().toCharArray();
          	Arrays.sort(ch[c]);
          	s[c]=String.valueOf(ch[c]);	
    	}
  		Arrays.sort(s);
  		for(int d=0;d<n;d++){
    	for(int e=d+1;e<n;e++){
 		if(s[d].equals(s[e])){
    		ans++;
    	}else{
     		break;
   	 }
        }
        }
    	System.out.println(ans);
    }
}