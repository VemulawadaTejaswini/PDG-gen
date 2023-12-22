import java.util.*;

class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int r = sc.nextInt();
      int[] towns = new int[r];
      for(int i = 0; i < r; i++) {
          towns[i] = sc.nextInt();
      }
      int[][] mat = new int[n][n];
      for(int i = 0; i < m; i++) {
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          mat[a-1][b-1] = c;
          mat[b-1][a-1] = c;
      }
      int[][] mat2 = mat;
      for(int k = 0; k < n; k++) {
        for(int i = 0; i < n; i++) {
          for(int j = 0; j < n; j++) {
              mat2[i][j] = Math.min(mat2[i][j], mat2[i][k]+mat2[k][j]);
          }
        }
      }
      ArrayList<Integer> perms = new ArrayList<Integer>();
      permute(towns, towns.length, towns.length, perms);
      int min = 10000000;
      int length = towns.length;
      for(int i = 0; i < perms.size(); i++) {
        int[] currPerm = new int[length];
        for(int j = 0; j < length; j++) {
          currPerm[j] = perms.get(i+j);
        }
        int shortest = 0;
        for(int j = 0; j < length-1; j++) {
          int a = currPerm[j]-1;
          int b = currPerm[j+1]-1;
          shortest += mat2[a][b];
        }
        
        min = Math.min(min, shortest);
        i += length-1;
      }
      System.out.println(min);
    }
  
    private static void permute(int a[], int size, int n, ArrayList<Integer> list)
    {
        if (size == 1) {
          for(int i = 0; i < a.length; i++) {
            list.add(a[i]);
          }
        }
 
        for (int i=0; i<size; i++)
        {
            permute(a, size-1, n, list);
 
            if (size % 2 == 1)
            {
                int temp = a[0];
                a[0] = a[size-1];
                a[size-1] = temp;
            }
 
            else
            {
                int temp = a[i];
                a[i] = a[size-1];
                a[size-1] = temp;
            }
        }
    }

}