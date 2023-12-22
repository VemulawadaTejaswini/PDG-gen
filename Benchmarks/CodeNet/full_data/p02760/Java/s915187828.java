import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Main{
    public static void main(String[]args){
        int[][] bingo=new int[3][3];
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                bingo[i][j]=sc.nextInt();
            }
        }
      
        int N=sc.nextInt();
        int count=0;
        int [] number =new int[N];

        for(int i=0;i<N;i++){
            number[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int m=0;m<N;m++){
                    if(number[m]==bingo[i][j])
                    count+=1;
                }
            }
        }
        if(count!=0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}