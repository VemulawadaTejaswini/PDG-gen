import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        String[] array = data.split(" ");
        int n = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        
        int[][] table = new int[m][2];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                table[i][j] = sc.nextInt();
            }
        }
        
        int[] seisu = new int[n];
        String[] memo = new String[n];
        
        int result = 0;
        for(int i = 0; i < m; i++)
        {
            int keta = table[i][0];
            int suuji = table[i][1];
            
            if(memo[keta - 1] == null)
            {
                seisu[keta - 1] = suuji;
                memo[keta - 1] = "x";
            }
            else
            {
                if(suuji != seisu[keta - 1])
                result = -1;
            }
        }
        
        if(result != -1)
        {
            String buf = "";
            for(int i = 0; i < n; i++)
            {
                buf = buf + String.valueOf(seisu[i]);
            }
            result = Integer.parseInt(buf);
            int resultlen = String.valueOf(result).length();
            if(resultlen < n)
            {
                result = -1;
            }
        }
        
        System.out.println(result);
    }
}
