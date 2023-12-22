import java.util.*;


public class Main {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
           
            int n = sc.nextInt();
            int[] color = new int[n];
            for (int i = 0; i < n; i++) {
                color[i] = sc.nextInt();
            }
            Arrays.sort(color);
            List<Integer> hoge = new ArrayList<Integer>();
            int tmp = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((color[i] - sum)%2!=0 && (color[i]-sum) > 0 ) {
                    hoge.add(n-tmp);
                    sum = color[i];
                    tmp++;
                }else{
                    tmp++;
                }
            }

            int cond = 0;
            for (int i = 0; i < hoge.size(); i++) {
                cond = cond^hoge.get(i);
            }
            if (cond != 0) {
                System.out.println("first");
            }else{
                System.out.println("second");
            }
            sc.close();
        }
    
}

