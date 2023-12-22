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
            if (entry1[col] < entry2[col]) 
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
    int arr[][]=new int[N][3];
    for(int i=0;i<N;i++){
    for(int j=0;j<2;j++){
     arr[i][j]=obj.nextInt();
   }
   arr[i][2]=arr[i][1]/arr[i][0];
   }
  long v=0;
int max=0;
sortbyColumn(arr,2);

for(int i=0;i<N&&W>0;i++){
   if(W>=arr[i][0]){
    v+=arr[i][1];
    W=W-arr[i][0];
}

}
System.out.println(v);
 
}

}
