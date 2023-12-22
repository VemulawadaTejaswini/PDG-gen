import java.util.*;
import java.io.*;

public class TaskD {

    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        int[] team = new int[n];
        int[] food = new int[n];
        int[] foodRev = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            team[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            food[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(team);
        Arrays.sort(food);
        for(int i = 0; i<n; i++){
            foodRev[i] = food[n-i-1];
        }
        for(int i = 0; i<n; i++){
            food[i] = foodRev[i];
        }
        //pw.println(Arrays.toString(food));
        //pw.println(Arrays.toString(team));
        long max = 0;
        for(int i = 0; i<n; i++){
            max = Math.max(food[i]*team[i], max);
        }
        long min = 0;
        long mid = 0;
        while(max > min){
            mid = min + (max - min)/2; // value we're checking for
            long kCount = 0;
            long score = 0;
            //System.out.println(min + " " + max);
            for(int i = 0; i<n; i++){
                if(food[i]*team[i] <= mid) {
                    continue;
                }
                else{
                    kCount += team[i] - (long)(Math.floor((double)mid/food[i]));
                }
            }
            if(kCount > k){
                min = mid+1;
            }
            else{
                max = mid;
            }
        }
        pw.println(max);
        pw.close();


    }
}