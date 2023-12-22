import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Long> bc = new ArrayList<>();

        for (int i=0; i<N; i++){
            bc.add(sc.nextLong());
        }

        long[][] tmpBC = new long[M][2];

        for (int i=0; i < M; i++){
            tmpBC[i][0] = sc.nextInt();
            tmpBC[i][1] = sc.nextLong();
        }
        sc.close();

        Arrays.sort(tmpBC, Comparator.comparing((long[] arr) -> arr[1]).reversed());

//        for (int z=0; z<M; z++){
//            System.out.println("tmpB["+z+"]:"+ tmpBC[z][0]+" tmpC["+z+"]:"+ tmpBC[z][1]);
//        }

        int count=0;
        END: for (int i=0; i<M; i++){
            for (int j=0; j<tmpBC[i][0]; j++){
                bc.add(tmpBC[i][1]);
                count++;
                if(count >= N){
                    break END;
                }
            }
        }

        Collections.sort(bc, Comparator.reverseOrder());

        long result=0;
        for (int i=0; i<N; i++){
            result += bc.get(i);
        }

        System .out.println(result);

    }
}