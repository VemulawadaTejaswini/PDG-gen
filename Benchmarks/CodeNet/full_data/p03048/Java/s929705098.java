import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        int N = sc.nextInt();
       
        sc.close();
        
        int temp [] = new int [10];
        sort3(a, temp);
        
        int count = 0;
        
        if (N>=a[0]){
        	int remainder = N-(N/a[2])*a[2];
            
            if (remainder%a[0]==0){
        	for (int i = 0; i<N/a[2]+1; i++){
        		if (remainder%a[0]==0)
        			count = count + remainder/a[1];
        		remainder = remainder+a[2];
        	}
        	System.out.println(count+N/a[2]+1);
            }
            else
            	System.out.println(0);
        }
        else
        	System.out.println(0);
        
   
	}
	
	static void sort3(int arr[], int temp[]) { 
	
	    if (arr[1] < arr[0]) 
	        { 
	            temp[0] = arr[0]; 
	            arr[0] = arr[1]; 
	            arr[1] = temp[0]; 
	        } 
	  
	    if (arr[2] < arr[1]) 
	    { 
	            temp[0] = arr[1]; 
	            arr[1] = arr[2]; 
	            arr[2] = temp[0]; 
	              
	    if (arr[1] < arr[0]) 
	        { 
	            temp[0] = arr[0]; 
	            arr[0] = arr[1]; 
	            arr[1] = temp[0]; 
	        } 
	    } 
	} 

}
