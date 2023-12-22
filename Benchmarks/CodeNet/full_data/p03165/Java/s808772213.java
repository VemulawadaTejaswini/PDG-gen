import java.util.*;
public class Main
{
   int l1,l2;
   String str;
   String s1,s2;
   String memo[][];
   memok(String s1,String s2)
   {
       this.s1=s1+"";
       this.s2=s2+"";
       l1=s1.length();
        l2=s2.length();
       memo=new String[l1][l2];
       for(int i=0;i<l1;i++)
       {
           for(int j=0;j<l2;j++)
           memo[i][j]="";
        }
       
    }
    String lcs(int i,int j)
    {String ans;
        if(i==l1||j==l2)
            {
                return "";
            }
                
        if(memo[i][j]!="")
        {
            return(memo[i][j]);
        }
        else
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                ans=s1.charAt(i)+lcs(i+1,j+1);
                memo[i][j]=ans;
              }
              else
              {
               if(lcs(i+1,j).length()>lcs(i,j+1).length())
               {
                   ans=lcs(i+1,j);
                }
                   else
                   {
                   ans=lcs(i,j+1);
                }
                 memo[i][j]=ans;
                }
               return(memo[i][j]);
         }
        }
    
        public static void main (String arge[])
        {
            String s1,s2;
            Scanner sc=new Scanner(System.in);
            s1=sc.nextLine();
            s2=sc.nextLine();
            Main obj=new Main(s1,s2);
            String s;
            s=obj.lcs(0,0);
            System.out.print(s);
        }
    }
            
            
        
    
