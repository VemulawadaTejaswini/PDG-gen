import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Hi = new int[N];
   for(int i =0;i<N;i++)
   {
   Hi[i] = sc.nextInt();
   }
   int outcount=0;
   for(int i=0;i<N-1;i++)
   {
    if(Hi[i]=<Hi[i+1]){outcount=0;}
    else
    {
    if(Hi[i] == Hi[i+1]+1) outcount++;
    else outcount=2;
    }
    
    if(outcount==2) break;
   }
    if(outcount==2) System.out.println("No");
    else System.out.println("Yes");
 }
}