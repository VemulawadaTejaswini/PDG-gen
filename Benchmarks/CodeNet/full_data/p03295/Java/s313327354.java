import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int s[] = new int[m];
        int e[] = new int[m];
        int distance[] = new int[m];
        boolean delFlag[] = new boolean[m];
        
        for(int i = 0; i < m; i++){
            s[i] = sc.nextInt();
            e[i] = sc.nextInt();
            distance[i] = e[i] - s[i];
            delFlag[i] = false;
        }
        
        int count = 0;
        while(true){
            int maxIndex = maxDistIndex(distance, delFlag);
            if(maxIndex == -1){
                break;
            }
            search(maxIndex, s[maxIndex], e[maxIndex], s, e, delFlag, distance);
            count++;
        }
        
        System.out.println(count);
        
    }
    
    private static int maxDistIndex(int[] distance, boolean[] delFlag){
        int max = 0;
        int maxIndex = -1;
        for(int i = 0; i < distance.length; i++){
            if(!delFlag[i]){
                if(distance[i] > max){
                    max = distance[i];
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }
    
    private static void search(int m, int start, int end, int[] s, int[] e, boolean[] delFlag, int[] distance){
        delFlag[m] = true;
        int max = 0;
        int maxIndex = -2;
        while(true){
            maxIndex = -1;
            for(int i = 0; i < distance.length; i++){
                if(delFlag[i] == false && ((s[i] >= start && s[i] < end) || (e[i] <= end && e[i] >= start))){
                    if(distance[i] > max){
                        max = distance[i];
                        maxIndex = i;
                    }
                }
            }
            if(maxIndex == -1){
                break;
            }else{
                search(maxIndex, s[maxIndex] < start ? start : s[maxIndex], e[maxIndex] > end ? end : e[maxIndex], s, e, delFlag, distance);
            }
        }
    }
}
