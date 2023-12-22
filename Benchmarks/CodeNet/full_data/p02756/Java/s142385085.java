import java.util.*;
import java.io.*;
public class Main{
  
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int q=sc.nextInt();
        boolean rev=false;
        
        for(int i=0;i<q;i++){

            int num=sc.nextInt();

            if(num==1){
                rev=!rev;
            }


            else{

                int p=sc.nextInt();
                char ch=sc.next().charAt(0);
                
                if(p==1){//add at beginning

                    if(!rev){
                        s=ch+s;
                    }else{
                        s=s+ch;
                    }
            }

                   else{//add at last
                       
                    if(!rev){
                        s=s+ch;
                    }else{
                        s=ch+s;
                    }
                   }
                }
            }

        if(!rev){
            System.out.println(s);
        }else{
            String str=new StringBuilder(s).reverse().toString();
            System.out.println(str);
        }


    }
}