import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[m][3];
        for (int i = 0; i < m; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
            array[i][2] = i;
        }
        
        Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1]));    // foo[][1]で
        Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));    // foo[][0]で
        
        String[] id = new String[m];
        int nowp = -1;
        int nowy = -1;
        int y = 0;
        for (int i = 0; i < m; i++) {
            int px = array[i][0];
            int yx = array[i][1];
            if (yx != nowy) {
                nowy = yx;
                y++;
            }
            if (px != nowp) {
                nowp = px;
                
                nowy = yx;
                y = 1;
            }
            
            String upper = String.valueOf(px);
            while (upper.length() < 6) {
                upper = "0" + upper;
            }
            String lower = String.valueOf(y);
            while (lower.length() < 6) {
                lower = "0" + lower;
            }
            int index = array[i][2];
            id[index] = upper + lower;
        }
        
        for (int i = 0; i < m; i++) {
            System.out.println(id[i]);
        }
    }
}