import java.util.Scanner;
public class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int amr,flag;
      flag=0;
      amr=0;
      int N=sc.nextInt();
      int A=sc.nextInt();
      if(N%500==0){
        flag=1;  
        System.out.println("Yes");
      }
      else for(int i=0;i<A;i++){
               amr=N%500;
               if(amr==i) {  
                flag=1;   
                System.out.println("Yes");
                              break;
                }
                 
            }
     if(flag==0) System.out.println("No");
     sc.close();

      
         
    }
}