import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int a[][]=new int[N][M];
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                a[i][j]=0;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                try{
                    a[i-1][j-1]++;}
                    catch(ArrayIndexOutOfBoundsException e){

                    }
                    try{
                    a[i][j-1]++;}
                    catch(ArrayIndexOutOfBoundsException e){

                    }
                    try{
                    a[i+1][j-1]++;}
                    catch(ArrayIndexOutOfBoundsException e){

                    }
                    try{
                    a[i-1][j]++;}
                    catch(ArrayIndexOutOfBoundsException e){

                    }
                    try{
                    a[i][j]++;}
                    catch(ArrayIndexOutOfBoundsException e){

                    }
                    try{
                    a[i+1][j]++;}
                    catch(ArrayIndexOutOfBoundsException e){

                    }
                    try{
                    a[i-1][j+1]++;}
                    catch(ArrayIndexOutOfBoundsException e){

                    }
                    try{
                    a[i][j+1]++;}
                    catch(ArrayIndexOutOfBoundsException e){

                    }
                    try{
                    a[i+1][j+1]++;}
                catch(ArrayIndexOutOfBoundsException e){

                }}
                
            }
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(a[i][j]%2==1){
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        
       


        }
       
        
    }