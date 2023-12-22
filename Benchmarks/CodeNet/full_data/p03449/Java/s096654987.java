

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner sc=new Scanner(System.in);
    static int count=0,res=0; 
    static int n=sc.nextInt();
    static int m=n;
    static int map[][]=new int[3][n+1];
 //   static int book[][]=new int[3][n+1];
    static int result[]=new int[2*n+1];
    public static void dfs(int count,int x,int y){
        if(count==m+1) {
           // if(res==0) m+=1;
            res++;  
            return;}
       if(x<0||x>2||y<0||y>n) return;
        System.out.println(count+" "+x+" "+y+" "+map[x][y]);
        result[res]+=map[x][y];
        count++;
        dfs(count,x+1,y);
        dfs(count,x,y+1);
        
         
    }
    public static void main(String[] args) {
        // TODO code application logic here
      //  Scanner sc=new Scanner(System.in);
        for(int i=1;i<=2;i++){
            for(int j=1;j<=n;j++){
                map[i][j]=sc.nextInt();
                map[i][j]+=Math.max(map[i-1][j],map[i][j-1]);
            }
        }
        System.out.println(map[2][n]);
        //dfs(0,1,1);
//        int max=result[0];
//        for(int i=0;i<res;i++){
//            System.out.println(result[i]);
//            if(max<result[i])
//                max=result[i];
//        }
//        System.out.println(max);
//        
       
     
        


        }
        
    }
    

