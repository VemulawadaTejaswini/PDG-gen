import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0;i < x.length;i++){
            x[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 1;i < x.length;i++){
            for(int j = 1;j < x.length;j++){
                if(x[i] <= x[j]){
                }else{
                    continue;
                }
            }
            count++;
        }

        System.out.println(count);

    }
}
