import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static boolean areDistinct(Integer arr[])
    {
        // Put all array elements in a HashSet 
        Set<Integer> s =
                new HashSet<Integer>(Arrays.asList(arr));

        // If all elements are distinct, size of 
        // HashSet should be same array. 
        return (s.size() == arr.length);
    }

    // Driver code 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Integer[] arr = new Integer[x];
        int i = 0;
        while (i < arr.length) {
           arr[i]  = sc.nextInt();
           i++;
        }

        if (areDistinct(arr))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
} 