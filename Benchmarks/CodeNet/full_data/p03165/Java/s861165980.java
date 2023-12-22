import java.util.*;

public class Main
{
	public static void main (String[] args) 
	{
		
 		Scanner sc= new Scanner(System.in);
 		String s1= sc.next();
 		String s2 = sc.next();
 		//int dp[][]=new int[s1.length()+1][s2.length()+1];
 		String dps[][]=new String[s1.length()+1][s2.length()+1];
//  		int arr_str[]=new int[s1.length()+1];
//  		Arrays.fill(arr_str,-1);
 		int maxv = Integer.MIN_VALUE;
 		for(int i=0;i<=s1.length();i++){
 		    for(int j=0;j<=s2.length();j++){
 		        if(i==0||j==0){
 		            //dp[i][j]=0;
 		            dps[i][j]="";
 		        }
 		        else {
 		            if(s1.charAt(i-1)==s2.charAt(j-1)){
 		                //dp[i][j]= dp[i-1][j-1]+1;
 		                dps[i][j] = dps[i-1][j-1]+s1.charAt(i-1)+"";
 		            }
 		            else {
 		                //dps[i][j]=Math.max(dps[i-1][j].length(),dps[i][j-1].length());
 		                if (dps[i-1][j].length()>dps[i][j-1].length()){
 		                 dps[i][j] = dps[i-1][j];
 		                }
 		                else {
 		                    dps[i][j] = dps[i][j-1];
 		                     //   arr_str[i-1] = i-1;
 		                }
 		                
 		            }
 		        }
 		    }
 		}
//  		for(int i=0;i<arr_str.length;i++){
//  		    System.out.print(arr_str[i]+" ");
//  		}
//  		System.out.println();
//  		//System.out.println(dp[s1.length()][s2.length()]);
//  		for(int i=0;i<=s1.length();i++){
//  		    for(int j=0;j<=s2.length();j++){
//  		        System.out.print(dps[i][j]+" ");
//  		    }
//  		    System.out.println("");
//  		}
 		System.out.println(dps[s1.length()][s2.length()]);
	

	    
		
	}
}