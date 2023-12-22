import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        float count = 0;
        float ave = 0;
        float distance[] = new float[n];
        float min = 101;

        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            count += a[i];
        }
        ave = count/(float)n;

        for(int i=0;i<n;i++){
            distance[i] = Math.abs(a[i]-ave);
            if(distance[i] <= min){
                min = distance[i];
            }
        }

        for(int i=0;i<n;i++){
            if(distance[i] == min){
                array.add(i);
            }
        }

        int x = Collections.min(array);

        System.out.println(x);
    }
}