import java.util.Scanner;
import java.lang.Math;

public class Main {
    
    private static void FindColoring (int[][] g, int n) {
        int[] colors = new int[n + 1];
        
        for (int i = 0; i < n + 1; i++) {
            colors[i] = -1;        
        }    
        
        colors[1] = 0;
        
        for (int i = 1; i < n + 1; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if (g[i][j] >= 0 && g[i][j] % 2 == 0) {
                    colors[j] = colors[i];                
                }            
                else if (g[i][j] >= 0 && g[i][j] % 2 != 0)  {
                    colors[j] = Math.abs(1 - colors[i]);  
                }
            }        
        }
        
       for (int i = 1; i < n + 1; i++) {
            System.out.println(colors[i]); 
       }
    
    }
    
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int n = Integer.parseInt(s);
            int[][] g = new int[n + 1][n + 1];  


            /*
            // Keep taking user input till the user types it
            do {
                str = sc.nextLine();
                String[] inps = str.split(" ");
                int u = Integer.parseInt(inps[0]);
                int v = Integer.parseInt(inps[1]);
                int w = Integer.parseInt(inps[2]);                            
                System.out.println(u + " " + v + " " + w);    
                g[u][v] = g[v][u] = w;
            } while (!str.isEmpty());
            */
            
            String line = sc.nextLine();
            while (!line.equals("")) {
                String[] inps = line.split(" ");
                int u = Integer.parseInt(inps[0]);
                int v = Integer.parseInt(inps[1]);
                int w = Integer.parseInt(inps[2]);                            
                System.out.println(u + " " + v + " " + w);    
                g[u][v] = w;
                g[v][u] = w;
                line = sc.nextLine();
            }          
            
            /*
            System.out.println("The graph:");
            for (int i = 0; i < n + 1; i++ ) {
                for (int j = 0; j < n + 1; j++) {
                    System.out.print(g[i][j] + "\t");                
                }           
                System.out.println(); 
            }
            */

            FindColoring(g, n);
            
        }
    }
}