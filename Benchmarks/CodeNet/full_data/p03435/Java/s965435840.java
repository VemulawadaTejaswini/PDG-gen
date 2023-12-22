import java.util.Scanner;
public class Main{
    static int[][] mat = new int[3][3];
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        
        int i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                mat[i][j] = sc.nextInt();
                a[i] += mat[i][j];
                b[j] += mat[i][j];
            }
        }
        
        for(i = 0; i < 3; i++){
            a[i] = a[i]/3;
            b[i] = b[i]/3;
        }
        
        if(cumple(a,b) || cumple(a, new int[]{mat[0][0] - a[0], mat[0][1] - a[1], mat[0][2] - a[2]})
           || cumple(new int[]{mat[0][0] - b[0], mat[0][1] - b[1], mat[0][2] - b[2]}, b))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    private static boolean cumple(int[]a, int[]b){
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++){
                if(mat[i][j] != a[i] + b[j])
                    return false;
            }
        return true;
    }
}