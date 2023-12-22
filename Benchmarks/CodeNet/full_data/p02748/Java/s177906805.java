import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
		int m=sc.nextInt();

  		int[] a1=new int[a];
		for(int c=0;c<a;c++){
    		a1[c]=sc.nextInt();
    	}
  	  int[] b1=new int[b];
		for(int c=0;c<b;c++){
    		b1[c]=sc.nextInt();
    	}
  		int min=100000000;
  
		for(int c=0;c<m;c++){
    		int x=sc.nextInt();
          	int y=sc.nextInt();
          	int d=sc.nextInt();
            int g=a1[x-1]+b1[y-1]-d;
            min=Math.min(g,min);
    	}
  		
  		Arrays.sort(a1);
  		Arrays.sort(b1);
  		int min1=a1[0]+b1[0];
    
  
 	if(min1>=min){
    		System.out.println(min);
    	}else{
     		System.out.println(min1);
   	 }

    }
}