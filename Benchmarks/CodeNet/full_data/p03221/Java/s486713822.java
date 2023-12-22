import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //県の数
        int m = sc.nextInt();   //市の数
        int prefectures[] = new int[m];
        int cities[] = new int[m];
        Map<Integer, List<Integer>> info = new HashMap<>();
        for(int i=0; i<m; i++){
            prefectures[i] = sc.nextInt(); //県の番号
            cities[i] = sc.nextInt();   //市の番号
            if(!info.containsKey(prefectures[i])){
                info.put(prefectures[i], new ArrayList<>());
            }
            info.get(prefectures[i]).add(cities[i]);
        }
        int rank[] = new int[m];
        for(int key : info.keySet()){
            Collections.sort(info.get(key));
            int cnt = 0;
            for(int r : info.get(key)){
                cnt++;
                rank[search(cities, r)] = cnt;
            }
        }
        
        for(int i=0; i<m; i++){
            System.out.printf("%06d",prefectures[i]);
            System.out.printf("%06d",rank[i]);
            System.out.printf("\n");
        }
    }

    public static int search(int array[], int value){
        for(int i=0; i<array.length; i++){
            if(array[i] == value) return i;
        }
        return -1;
    }
}