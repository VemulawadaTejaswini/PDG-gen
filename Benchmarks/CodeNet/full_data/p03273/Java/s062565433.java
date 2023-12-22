import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();

  		String[][] a=new String[h][w];
		for(int c=0;c<h;c++){
          	String s=sc.next();
    		a[c]=s.split("");
    	}
  		 int[] d=new int[w];
    	for(int b=0;b<w;b++){
          int count=0;
          for(int c=0;c<h;c++){
          if(a[c][b].equals(".")){
            count++;
          }
          }
          if(count!=h){
           d[b]=1;
          }
        }
     
  for(int c=0;c<h;c++){
    String ans="";
    int count2=0;
    for(int f=0;f<w;f++){
     if(a[c][f].equals(".")){
     count2++;
     }
    }
    if(count2!=w){
    for(int e=0;e<w;e++){
    if(d[e]==1){
      ans+=a[c][e];
    }
    }
    System.out.println(ans);
    }
  }

    	
    }
}