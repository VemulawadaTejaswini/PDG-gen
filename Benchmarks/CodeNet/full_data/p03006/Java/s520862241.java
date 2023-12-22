import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int init_count=0;

//        int xy_list [][] = new int[n*(n-1)/2][2];
//        List<Integer> x_list = new ArrayList<>();
//        List<Integer> y_list = new ArrayList<>();


        int xy[][] = new int[n][2];
        for (int i=0; i<n; i++){
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }

        for (int j=0; j<n-1; j++){
            for (int k=j+1; k<n; k++ ){
                int p = xy[j][0]-xy[k][0];
                int q = xy[j][1]-xy[k][1];
                int count=0;
                for (int l=0; l<n; l++){
                    for (int m=l; m<n; m++){
                        if ((xy[l][0]-xy[m][0]==p)&(xy[l][1]-xy[m][1]==q)){
                            count++;
                        }
                    }
                }
                init_count = Math.max(init_count, count);
            }
        }
        System.out.println(n-init_count);


    }
}

