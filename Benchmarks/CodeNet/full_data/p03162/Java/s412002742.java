import java.util.Scanner;
public class Main{
    
    
    	static int arr[][];
    
   static int solvedispute(int a,int b,int c,int i,int curr){
        
         int n_max=Math.max(arr[i+1][0],arr[i+1][1]);
            n_max=Math.max(n_max,arr[i+1][2]);
            int cn=0;
            if(arr[i+1][0]==n_max) cn=0;
            if(arr[i+1][1]==n_max) cn=1;
            if(arr[i+1][2]==n_max) cn=2;
            // System.out.println("****"+cn);
            if( a== b && b==c){
                if(cn ==0) return 1;
                if(cn ==1) return 0;
                if(cn ==2) return 0;
            }
            // System.out.println("$$$$"+i);
            // System.out.println("curr: "+curr);
            if(a == b && curr == 0){
                if(cn == 0) return 1;
                else if(cn == 1) return 0;
                else return 0;
               
            }
             if(a == c && curr == 0){
                if(cn == 0) return 2;
                else if(cn == 2) return 0;
                else return 0;
            }
            if(b == c && curr == 1){
                if(cn == 1) return 2;
                else if(cn == 2)return 1;
                else return 1;
            }
            return curr;
            
    }
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      
      	int n=sc.nextInt();
            arr=new int[n][3];
        int dp[][]=new int[n][3];
      	int curr=0;
      	int prv=-1;
        long sum=0;
        boolean flag=true;
        
        for(int i=0;i<n;i++)
        {
            	arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();
        }
      	for(int i=0;i<n;i++){
            
            flag=true;
        
            
            int max=Math.max(arr[i][0],arr[i][1]);
            max=Math.max(max,arr[i][2]);
            
            if(arr[i][0]==max) curr=0;
            else if(arr[i][1]==max) curr=1;
            else if(arr[i][2]==max) curr=2;
            
            if((arr[i][0] == arr[i][1] || arr[i][1] == arr[i][2] || arr[i][2]==arr[i][0]) && i !=n-1)
            {
                flag=false;
                int c = solvedispute(arr[i][0],arr[i][1],arr[i][2],i,curr);
                //  System.out.println(c);
                sum+=arr[i][c];
                prv=c;
            }
            
            if(flag){
                    if(curr == prv)
                    {
                        if(curr == 1){
                            if(arr[i][0] >=arr[i][2]){
                                sum+=arr[i][0];
                                curr=0;
                            }
                            else
                            {
                                sum+=arr[i][2];
                                curr=2;
                            }
                        }
                        else if(curr == 2){
                            if(arr[i][0] >=arr[i][1]){
                                sum+=arr[i][0];
                                curr=0;
                            }
                            else
                            {
                                sum+=arr[i][1];
                                curr=1;
                            }
                        }
                        else if(curr == 0){
                            if(arr[i][2] >=arr[i][1]){
                                sum+=arr[i][2];
                                curr=2;
                            }
                            else
                            {
                                sum+=arr[i][1];
                                curr=1;
                            }
                        }
                        prv=curr;
                    }
                    else{
                        sum+=max;
                        prv=curr;
                    }
                    // System.out.println(curr);
            }
        }
        System.out.println(sum);
     
        
      }
    }
