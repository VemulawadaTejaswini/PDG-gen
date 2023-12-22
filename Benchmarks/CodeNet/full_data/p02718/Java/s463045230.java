//PopularVote.java
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();
        Integer a[]=new Integer[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());
        int ans=0;
        for(int i=0; i<m; i++){
            ans++;
            if(a[i]<1/4*m){
                ans--;
                break;
            }           
        }
        if(ans==m){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}