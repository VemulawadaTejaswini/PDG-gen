import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<Integer, Integer> map1 = new TreeMap<>();
        Map<Integer, Integer> map2 = new TreeMap<>();
        for(int i = 0; i < N; i++){
            map1.put(sc.nextInt(), sc.nextInt());
        }
        for(int i = 0; i < N; i++){
            map2.put(sc.nextInt(), sc.nextInt());
        }
        sc.close();

        int[][] a1 = new int[2][N];
        int[][] c1 = new int[2][N];
        int i = 0;
        for(Integer key: map1.keySet()){
            a1[0][i] = key;
            a1[1][i] = map1.get(key);
            i++;
        }
        int j = 0;
        for(Integer key: map2.keySet()){
            c1[0][j] = key;
            c1[1][j] = map2.get(key);
            j++;
        }
        
        int count1 = 0;
        loop1: for(int k = 0; k < N; k++){
            for(int l = 0; l < N; l++){
                if(a1[0][k] < c1[0][l]){
                    if(a1[1][k] < c1[1][l]) {
                        count1++;
                        //System.out.println("(" + a1[0][k] + "," + a1[1][k] + "), (" + c1[0][l] + "," + c1[1][l] + ")");
                        c1[0][l] = -1;
                        continue loop1;
                    }
                }
            }
        }
        Map<Integer, Integer> map3 = new TreeMap<>();
        Map<Integer, Integer> map4 = new TreeMap<>();
        for(Integer key: map1.keySet()){
            map3.put(map1.get(key), key);
        }
        for(Integer key: map2.keySet()){
            map4.put(map2.get(key), key);
        }
        int[][] a2 = new int[2][N];
        int[][] c2 = new int[2][N];
        i = 0; 
        j = 0;
        for(Integer key: map3.keySet()){
            a2[0][i] = map3.get(key);
            a2[1][i] = key;
            i++;
        }
        for(Integer key: map4.keySet()){
            c2[0][j] = map4.get(key);
            c2[1][j] = key;
            j++;
        }
       
        int count2 = 0;
        loop2: for(int k = 0; k < N; k++){
            for(int l = 0; l < N; l++){
                if(a2[1][k] < c2[1][l]){
                    if(a2[0][k] < c2[0][l]) {
                        count2++;
                        //System.out.println("(" + a2[0][k] + "," + a2[1][k] + "), (" + c2[0][l] + "," + c2[1][l] + ")");
                        c2[1][l] = -1;
                        continue loop2;
                    }
                }
            }
        }
        System.out.println(Math.max(count1, count2));
    }
}