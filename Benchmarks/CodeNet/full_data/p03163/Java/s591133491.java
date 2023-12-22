import java.util.*;
public class Main{
public static void sortbyColumn(int arr[][], int col) 
    { 
        // Using built-in sort function Arrays.sort 
        Arrays.sort(arr, new Comparator<int[]>() { 
            
          @Override              
          // Compare values according to columns 
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            // To sort in descending order revert  
            // the '>' Operator 
            if (entry1[col] > entry2[col]) 
                return 1; 
            else
                return -1; 
          } 
        });  // End of function call sort(). 
    } 
public static void main(String args[]){
     int N,W;
    Scanner obj=new Scanner(System.in);
    N=obj.nextInt();
    W=obj.nextInt();
    int arr[][]=new int[N+1][2];
    arr[0][0] = 0;
    arr[0][1] = 0;
    for(int i=1;i<=N;i++){
    for(int j=1;j<=2;j++){
     arr[i][j]=obj.nextInt();
   }
   
   }

sortbyColumn(arr,0);
int dp[][]=new  int[N][W];
for(int i=1;i<=N;i++){
   for(int j=arr[0][0];j<=W;j++){
     dp[i][j]=arr[i][0]+dp[i][j-arr[i][0]]
   }
}


System.out.println(dp[N][W]);
 
}

}
