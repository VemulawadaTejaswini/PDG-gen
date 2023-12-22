import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
       	int ans1=0;
  		int ans2=0;
  		int ans3=0;
  		int s1=0;
  		int s2=0;
  		int s3=0;
  		int count=0;
        int n=sc.nextInt();
		int m=sc.nextInt();
  		
		for(int d=0;d<m;d++){
    		int s=sc.nextInt();
          	int c=sc.nextInt();
          
           		if(s==1){
                  if(n==3&&c==0){
                  	count++;
                  }else if(n==2&&c==0){
                  	count++;
                  }else if(s1==0){
                      ans1=c;
                    }else{
                    	count++;
                    }
                  s1++;
                }else if(s==2){
                   if(s2==0){
                      ans2=c;
                    }else{
                    	count++;
                    }
                  s2++;
                }else{
                	if(s3==0){
                      ans3=c;
                    }else{
                    	count++;
                    }
                  s3++;
                }
           
        }
  		
  
  if(n==3&&ans1==0){
    		ans1=1;
    	}else if(n==2&&ans1==0){
  		ans1=1;
  }
  
   if(count>0){
    		System.out.println(-1);
    	}else if(n==3){
   	 System.out.println(Integer.parseInt(String.valueOf(ans1)+String.valueOf(ans2)+String.valueOf(ans3)));
   }else if(n==2){
    System.out.println(Integer.parseInt(String.valueOf(ans1)+String.valueOf(ans2)));
   }else{
   System.out.println(Integer.parseInt(String.valueOf(ans1)));
   }
	
   
    
    }
}

