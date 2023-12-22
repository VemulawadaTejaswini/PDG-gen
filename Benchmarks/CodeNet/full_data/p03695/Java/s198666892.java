import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   
   boolean glay = false;
   boolean blown = false;
   boolean green = false;
   boolean sky = false;
   boolean blue = false;
   boolean yellow = false;
   boolean orange = false;
   boolean red = false;
   
   int tmp = 0;
   int allcount=0;
   for(int i = 0;i<N;i++) 
   {
     tmp = sc.nextInt();
     if(!glay&&tmp<400) glay = true;
     else if(!blown&&tmp<800) blown = true;
     else if(!green&&tmp<1200) green = true;
     else if(!sky&&tmp<1600) sky = true;
     else if(!blue&&tmp<2000) blue = true;
     else if(!yellow&&tmp<2400) yellow = true;
     else if(!orange&&tmp<2800) orange = true;
     else if(!red&&tmp<3200) red = true;
     else allcount++;
   }
   int anslow =0;
   if(glay) anslow++;
   if(blown) anslow++;
   if(green) anslow++;
   if(sky) anslow++;
   if(blue) anslow++;
   if(yellow) anslow++;
   if(orange) anslow++;
   if(red) anslow++;
   
   int  anshigh =0
   if(anslow+allcount>=8) anshigh=8;
   else anshigh = anslow+allcount;
   System.println(anslow+" "+anshigh);
 }
}