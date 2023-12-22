import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        String[]moji=new String[H];
        for(int i=0;i<H;i++){
            moji[i]=sc.next();
        }
        int k=0;
        
        out:for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(j==0){
                    if(i==0){
                        if(((moji[i].charAt(j)=='#')&&(moji[i].charAt(j+1)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i+1].charAt(j)=='.'))){
                            k++;
                            break out;
                        }
                    }
                    else if(i==H-1){
                        if(((moji[i].charAt(j)=='#')&&(moji[i].charAt(j+1)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i-1].charAt(j)=='.'))){
                            k++;
                            break out;
                        }
                    }
                    else{
                        if(((moji[i].charAt(j)=='#')&&(moji[i].charAt(j+1)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i+1].charAt(j)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i-1].charAt(j)=='.'))){
                            k++;
                            break out;
                        }
                    }
                }
                else if(j==W-1){
                    if(i==0){
                        if(((moji[i].charAt(j)=='#')&&(moji[i].charAt(j-1)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i+1].charAt(j)=='.'))){
                            k++;
                            break out;
                        }
                    }
                    else if(i==H-1){
                        if(((moji[i].charAt(j)=='#')&&(moji[i].charAt(j-1)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i-1].charAt(j)=='.'))){
                            k++;
                            break out;
                        }
                    }
                    else{
                        if(((moji[i].charAt(j)=='#')&&(moji[i].charAt(j-1)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i+1].charAt(j)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i-1].charAt(j)=='.'))){
                            k++;
                            break out;
                        }
                    }

                    
                }else{
                    if(i==0){
                        if(((moji[i].charAt(j)=='#')&&(moji[i].charAt(j-1)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i+1].charAt(j)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i].charAt(j+1)=='.'))){
                            k++;
                            break out;
                        }
                    }
                    else if(i==H-1){
                        if(((moji[i].charAt(j)=='#')&&(moji[i].charAt(j-1)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i-1].charAt(j)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i].charAt(j+1)=='.'))){
                            k++;
                            break out;
                        }
                    }
                    else{
                        if(((moji[i].charAt(j)=='#')&&(moji[i].charAt(j-1)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i+1].charAt(j)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i-1].charAt(j)=='.'))&&((moji[i].charAt(j)=='#')&&(moji[i].charAt(j+1)=='.'))){
                            k++;
                            break out;
                        }
                    }


                }

            }
            
        }if(k==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        k=0;

        
}
        
        
    }
