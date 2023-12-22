import java.util.*;
import java.io.*;
class Main
{
   String Fill(int i,int j,String s1,String s2,String str[][],int l1,int l2)
    {
        if(i>l1-1||j>l2-1)
        return "";
        int x=0;
        for( x=0;x<l2;x++)
        {
            char ch=s2.charAt(x);
            if((ch==s1.charAt(i))&&(x>=j))
            { 
            
            break;
        }
            if(x==l2-1)
            {
                x=-1000000000;
                break;
                
            }
        }    
            String r="";String r1="";
            if(x>=0)
            r=s1.charAt(i)+str[i+1][x+1];
            
            r1=str[i+1][j];
            
            if(r1.length()>r.length())
            return r1;
        
              else
             return r;
        
        }
            
        
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1;
        String s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        int l1,l2;
        l1=s1.length();
        l2=s2.length();
        lcs obj=new lcs();
        String str[][]=new String[l1+1][l2+1];
        for(int s=0;s<l2+1;s++)
        {
            
        
        for(int t=0;t<l1+1;t++)
        {
            str[t][s]="";
        }
    }
        for(int i=l1-1;i>=0;i--)
        {
            for(int j=l2-1;j>=0;j--)
            {
                str[i][j]=obj.Fill(i,j,s1,s2,str,l1,l2);
            }
        }
        System.out.print(str[0][0]);
    }
}
        
        
        