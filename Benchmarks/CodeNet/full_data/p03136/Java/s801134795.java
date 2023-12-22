//Polygon.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l[]=new int[n];
		for(int i=0; i<n; i++){
            l[i]=sc.nextInt();
        }
        int sum=0;
        int ans=0;
        int max=l[0];
        for(int i=0; i<n; i++){
                if(l[i]>max){
                    max=l[i];
                }
        }  
        
        for(int i=0; i<n; i++){
            ans+=l[i];
        }
        sum=ans-max;
        //System.out.println(ans);
        //System.out.println(sum);
        if(sum>max){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}