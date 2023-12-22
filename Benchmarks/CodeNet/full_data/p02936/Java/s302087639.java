
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int p_c[][] = new int[2][n-1];

        for(int i=0;i<n-1;i++){
            p_c[0][i] = sc.nextInt();
            p_c[1][i] = sc.nextInt();
        }

        HashMap<Integer,Integer> scoremap = new HashMap<>();
        for(int i=0;i<q;i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            if(scoremap.containsKey(key)){
                int temp = scoremap.get(key);
                scoremap.put(key, temp+value);
            }else{
                scoremap.put(key,value);
            }
        }

        for(int i=0;i<n-1;i++){
            int parent = p_c[0][i];
            int child = p_c[1][i];

            int parent_value = 0;
            if(scoremap.containsKey(parent)) {
                parent_value = scoremap.get(parent);
            }

            //d("parent:" + parent + " child" + child + " parentv:" + parent_value);
            //d("containschild? " + scoremap.containsKey(child));
            if(scoremap.containsKey(child)) {
                int temp = scoremap.get(child);
                //d("temp:" + temp);
                scoremap.put(child,temp+parent_value);
            }else {
                scoremap.put(child, parent_value);
            }
        }

        for(int i=0;i<scoremap.size();i++){
            int score = scoremap.get(i+1);
            System.out.print(score + " ");
        }





    }

    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}
