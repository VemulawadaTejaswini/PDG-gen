

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x[]=new int[n+1];
       // int r[]=new int[n+1];
       // int d[]=new int[n+1];
        int bookl=0,flag=0;
        for(int i=1;i<=m;i++){
            
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(x[a]==0&&x[b]==0){
            x[a]=1;
            x[b]=x[a]+c;
            }
            if(x[a]!=0){
                if(x[b]!=0){
                    bookl=x[b];
                    x[b]=x[a]+c;
                    if(x[b]!=bookl){
                      // System.out.println(b+" "+x[b]);
                       flag=1;
                       break;
                    }
                }
                else{
                     x[b]=x[a]+c;
                }
                     
                  
                }

            
            
        }
        if(flag==0) System.out.println("Yes");
        else System.out.println("No");
        
        


        }
        
    }
    

