import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]=scanner.nextInt();

        boolean isAdjacentEqual=adjacentXOR(n,arr);

        if(isAdjacentEqual)
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    private static boolean adjacentXOR(int n, int[] arr) {

        boolean isAdjacentEqual = true;
        for (int i = 1; i < n-1; i++) {
            int temp=arr[i-1]^arr[i+1];
            if(temp != arr[i]) {
                isAdjacentEqual = false;
                break;
            }
        }

        return isAdjacentEqual;
    }
}