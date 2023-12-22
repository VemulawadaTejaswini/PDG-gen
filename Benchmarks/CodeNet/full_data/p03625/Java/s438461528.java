package contest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        int[] edges = new int[str.length];
        
        for(int i = 0; i < str.length; i++){
            edges[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(edges);
        
        if(n >= 4 && n <= Math.pow(10, 5)){
            for(int i = edges.length - 1; i > 0; i--){
                if(edges[i] >= 1 && edges[i] <= Math.pow(10, 9)){
                    for(int j = edges.length - 2; j > 0; j--){
                        if(edges[i] == edges[j]){
                            for(int k = j - 1; k < 0; k--){
                                if(edges[k] >= 1 && edges[k] <= Math.pow(10, 9)){
                                    for(int l = k - 1; k < 0; k--){
                                        if(edges[k] == edges[l]){
                                            System.out.println(edges[i] * edges[k]);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(0);
        }
            
    }
}
