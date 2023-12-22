import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int n[]=new int[N];
        for(int i=0;i<N;i++){
            n[i]=sc.nextInt();
        }
        int max=0;
        int Alice=0;
        int Bob=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(n[j]>=max){
                    max=n[j];
                }
                
                }
            Alice=Alice+max;
            for(int j=0;j<N;j++){
                if(max==n[j]){
                    n[j]=0;
                    max=0;
                    break;
                }
            }
            for(int j=0;j<N;j++){
                if(n[j]>=max){
                    max=n[j];
                }
                
                }
            Bob=Bob+max;
            for(int j=0;j<N;j++){
                if(max==n[j]){
                    n[j]=0;
                    max=0;
                    break;
                }
            }
        }
        System.out.println(Alice-Bob);

        }
        
     
    }
