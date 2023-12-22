import java.util.Arrays; 

  

public class GFG { 


    static void findTriplet(int arr[], int n) 

    { 

        

        Arrays.sort(arr);

        for (int i = n - 1; i >= 0; i--) { 

            int j = 0; 

            int k = i - 1; 

            while (j < k) { 

                if (arr[i] == arr[j] + arr[k]) { 

  

                    // pair found 

                    System.out.println("numbers are " + arr[i] + " "   + arr[j] + " " + arr[k]); 

  

                    return; 

                } 

                else if (arr[i] > arr[j] + arr[k]) 

                    j += 1; 

                else

                    k -= 1; 

            } 

        } 

        System.out.println("No such triplet exists"); 

    } 


    public static void main(String args[]) 

    { 

        int arr[] = { 5, 32, 1, 7, 10, 50, 19, 21, 2 }; 

        int n = arr.length; 

        findTriplet(arr, n); 

    } 
} 