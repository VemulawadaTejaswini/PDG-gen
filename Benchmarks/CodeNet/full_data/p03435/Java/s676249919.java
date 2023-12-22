import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

  		int[][] ci=new int[3][3];
		for(int c=0;c<3;c++){
    		ci[c][0]=sc.nextInt();
          	ci[c][1]=sc.nextInt();
         	ci[c][2]=sc.nextInt();
    	}
    int count=0;
  	for(int b=0;b<2;b++){
     if((ci[b+1][0]-ci[b][0])!=(ci[b+1][1]-ci[b][1])||(ci[b+1][1]-ci[b][1])!=(ci[b+1][2]-ci[b][2])){
     	count=1;
     }
    }
    for(int b=0;b<2;b++){
     if((ci[0][b+1]-ci[0][b])!=(ci[1][b+1]-ci[1][b])||(ci[1][b+1]-ci[1][b])!=(ci[2][b+1]-ci[2][b])){
     	count=1;
     }
    }
 	if(count==0){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }


    }
}
