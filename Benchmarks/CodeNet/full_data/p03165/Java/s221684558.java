import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class user
{
    int value;
    char dir;
    user()
    {
        value=0;
        dir='u';
    }
}

class Main
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        user value[][]=new user[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++)
          value[i][0]=new user();
        for(int i=0;i<=t.length();i++)
          value[0][i]=new user();
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=t.length();j++)
            {
                value[i][j]=new user();
                if(s.charAt(i-1)==t.charAt(j-1))
                  {
                      value[i][j].value=value[i-1][j-1].value+1;
                      value[i][j].dir='d';
                  }
                else 
                {
                    if(value[i][j-1].value>value[i-1][j].value)
                       {
                        value[i][j].value=value[i][j-1].value;
                        value[i][j].dir='l';
                       }
                    else
                    {
                        value[i][j].value=value[i-1][j].value;
                        value[i][j].dir='u';
                    }
                }
              //  System.out.print(value[i][j].value+" "+value[i][j].dir+", ");
            }
            //System.out.println("");
        }
        int i=s.length(),j=t.length();
        StringBuilder common=new StringBuilder("");
        while(i>=0&&j>=0&&value[i][j].value!=0)
        {
            if(value[i][j].dir=='l')
            {
                 j--;
            }
            else if(value[i][j].dir=='u')
            {
                i--;
            }
            else
             {
                 common=common.append(s.charAt(i-1));
                 i--;
                 j--;
             }
        }
        System.out.println(common.reverse().toString());
        sc.close();
    }
}