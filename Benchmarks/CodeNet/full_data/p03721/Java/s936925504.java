import java.util.Scanner;
/**
 * Write a description of class nandk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] element = new int[n];
        int[] times = new int[n];
        long sum = 0;
        for(int i =0;i<n;i++){
            element[i]=sc.nextInt();
            times[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=times[i];
            if(k <= sum){
                System.out.println(element[i]);
                break;
            }
        }
    }
}    