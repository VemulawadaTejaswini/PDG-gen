import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String args[])
    {
     String s,s2="";int a;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     s=sc.next();
    String s1[]=s.split("");
    int a1[]=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
         if(s1[i].equals("A"))
         {
             a1[i]=0+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("B"))
         {
             a1[i]=1+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("C"))
         {
             a1[i]=2+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("D"))
         {
             a1[i]=3+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("E"))
         {
             a1[i]=4+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("F"))
         {
             a1[i]=5+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("G"))
         {
             a1[i]=6+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("H"))
         {
             a1[i]=7+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("I"))
         {
             a1[i]=8+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("J"))
         {
             a1[i]=9+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("K"))
         {
             a1[i]=10+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("L"))
         {
             a1[i]=11+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("M"))
         {
             a1[i]=12+a;
             a1[i]=a1[i]%26;
         }else if(s1[i].equals("N"))
         {
             a1[i]=13+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("O"))
         {
             a1[i]=14+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("P"))
         {
             a1[i]=15+a;
             a1[i]=a1[i]%26;
         }else if(s1[i].equals("Q"))
         {
             a1[i]=16+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("R"))
         {
             a1[i]=17+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("S"))
         {
             a1[i]=18+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("T"))
         {
             a1[i]=19+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("U"))
         {
             a1[i]=20+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("V"))
         {
             a1[i]=21+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("W"))
         {
             a1[i]=22+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("X"))
         {
             a1[i]=23+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("Y"))
         {
             a1[i]=24+a;
             a1[i]=a1[i]%26;
         }
         else if(s1[i].equals("Z"))
         {
             a1[i]=25+a;
             a1[i]=a1[i]%26;
         }
         
        }
        for(int i=0;i<s1.length;i++)
        {
         if(a1[i]==0)
         {
             s2=s2+"A";
         }
         else if(a1[i]==1)
         {
             s2=s2+"B";
         }
         else if(a1[i]==2)
         {
             s2=s2+"C";
         }
         else if(a1[i]==3)
         {
             s2=s2+"D";
         }
         else if(a1[i]==4)
         {
             s2=s2+"E";
         }
         else if(a1[i]==5)
         {
             s2=s2+"F";
         }
         else if(a1[i]==6)
         {
             s2=s2+"G";
         }
         else if(a1[i]==7)
         {
             s2=s2+"H";
         }
         else if(a1[i]==8)
         {
             s2=s2+"I";
         }
         else if(a1[i]==9)
         {
             s2=s2+"J";
         }
         else if(a1[i]==10)
         {
             s2=s2+"K";
         }
         else if(a1[i]==11)
         {
             s2=s2+"L";
         }
         else if(a1[i]==12)
         {
             s2=s2+"M";
         }
         else if(a1[i]==13)
         {
             s2=s2+"N";
         }
         else if(a1[i]==14)
         {
             s2=s2+"O";
         }
         else if(a1[i]==15)
         {
             s2=s2+"P";
         }
         else if(a1[i]==16)
         {
             s2=s2+"Q";
         }
         else if(a1[i]==17)
         {
             s2=s2+"R";
         }
         else if(a1[i]==18)
         {
             s2=s2+"S";
         }
         else if(a1[i]==19)
         {
             s2=s2+"T";
         }
         else if(a1[i]==20)
         {
             s2=s2+"U";
         }
         else if(a1[i]==21)
         {
             s2=s2+"V";
         }
         else if(a1[i]==22)
         {
             s2=s2+"W";
         }
         else if(a1[i]==23)
         {
             s2=s2+"X";
         }
         else if(a1[i]==24)
         {
             s2=s2+"Y";
         }
         else if(a1[i]==25)
         {
             s2=s2+"Z";
         }
        }
        System.out.print(s2);
    }
}

