import java.util.Scanner;


public static void main(String[] xyz)
{
    
              Scanner sc=new Scanner(System.in);
              String s=sc.next();
              int l=s.length();
              int mid=(l-1)/2;
              for(int i=0;i<mid;i++)
              {
                  if(s.charAt(i)==s.charAt(mid-1-i))
                    continue;
                  else
                   {
                     System.out.println("NA");
                     return ;
                     }
               }
            String s2=s.substring(0,mid);
            String s3=s.substring(mid+1,l);
                     if(s2.equals(s3))
                     {
                    	 System.out.println("yes");
                    	 
                     }
                     else
                     {
                    	 System.out.println("NO");
                     }
     }
 
