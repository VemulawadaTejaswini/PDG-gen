import java.util.Scanner;

public class Main{
    public static void main(String[] args)throws Exception {
    int N =0,x=0 ,i=0,max=0,count=0;
    Scanner in = new Scanner (System.in);
    N=in.nextInt();
    int []add=new int[N];
    int []sub=new int[N];
    int []nthn=new int[N];
    while(N!=0){
     nthn[i]=in.nextInt();
     add[i]=nthn[i]+1;
     sub[i]=nthn[i]-1;
     i++;  
    N--;}
    in.close();
    
    //count for x
        for (int j = 0; j < nthn.length*2; j++) {
               for (int k = 0; k < nthn.length; k++) {
                   if (j<nthn.length)
                count = (nthn[j]==add[k]||nthn[j]==sub[k])?++count:count;
                else
                count = (sub[j-nthn.length]==add[k]||sub[j-nthn.length]==nthn[k])?++count:count;      
            }
            max=(max>count)?max:count;
            count=0;
        }
        System.out.println(max+1);
    }
}