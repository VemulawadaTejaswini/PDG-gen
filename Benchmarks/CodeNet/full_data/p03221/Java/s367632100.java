import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] cityData = new int[m][4];
        for (int i = 0; i < m; i++) {
            int index = i;
            int prefIndex = sc.nextInt();
            int birth = sc.nextInt();
            cityData[i] = new int[]{index, prefIndex, birth, 0};
        }
        
        Arrays.sort(cityData, (a, b) -> Integer.compare(a[2], b[2]));
        Arrays.sort(cityData, (a, b) -> Integer.compare(a[1], b[1]));
        
        int currentPref = cityData[0][1];
        int id = 1;
        for (int i = 0; i < m; i++) {
            int pref = cityData[i][1];
            if (pref != currentPref) {
                id = 1;
            }
            
            cityData[i][3] = id;
            id++;
        }
        
        Arrays.sort(cityData, (a, b) -> Integer.compare(a[0], b[0]));
        
        for (int[] c : cityData) {
            String prefID = String.valueOf(c[1]);
            String cityID = String.valueOf(c[3]);
            
            while (prefID.length() < 6) {
                prefID = "0" + prefID;
            }
            while (cityID.length() < 6) {
                cityID = "0" + cityID;
            }
            
            System.out.println(prefID + cityID);
        }
    }
}
