

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfItems = sc.nextInt();
        int knapSackWeight = sc.nextInt();
        int[] itemValue = new int[numOfItems+1];
        int[] itemWeight = new int[numOfItems+1];
        for(int i =1;i<=numOfItems;i++){
            itemWeight[i] = sc.nextInt();
            itemValue[i] = sc.nextInt();
        }
//        Arrays.sort(itemWeight);
        System.out.println(KnapSack(itemValue,itemWeight,numOfItems,knapSackWeight));
    }
    static int KnapSack(int val[], int wt[],
                        int n, int W) {
        // matrix to store final result  
        int mat[][] = new int[2][W + 1];

        // iterate through all items  
        int i = 0;
        while (i < n) // one by one traverse each element  
        {
            int j = 0; // traverse all weights j <= W  

            // if i is odd that mean till now we have odd  
            // number of elements so we store result in 1th  
            // indexed row  
            if (i % 2 != 0) {
                while (++j <= W) // check for each value  
                {
                    if (wt[i] <= j) // include element  
                    {
                        mat[1][j] = Math.max(val[i] + mat[0][j - wt[i]],
                                mat[0][j]);
                    } else // exclude element  
                    {
                        mat[1][j] = mat[0][j];
                    }
                }

            }

            // if i is even that means till now  
            // we have even number of elements 
            // so we store result in 0th indexed row  
            else {
                while (++j <= W) {
                    if (wt[i] <= j) {
                        mat[0][j] = Math.max(val[i] + mat[1][j - wt[i]],
                                mat[1][j]);
                    } else {
                        mat[0][j] = mat[1][j];
                    }
                }
            }
            i++;
        }

        // Return mat[0][W] if n is odd, else mat[1][W]  
        return (n % 2 != 0) ? mat[0][W] : mat[1][W];
    }
}

