import java.util.*;

/**
 * Created on 2016/08/21.
 */
public class Main {

    final static int NUM = (int)(1e5 + 2);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] idices = new int[NUM];
        Arrays.fill(idices, -1);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            int tmp = sc.nextInt();
            nums.add(tmp);
            idices[tmp] = i;
        }

        Collections.sort(nums);

        int bin = 0;


        int odd = 0;
        int even = 0;

        for(int num: nums){
            int idx = idices[num];

            if(idx % 2 == 0){
                // even
                int judge = idx + bin;
                if(judge % 2 != 0){
                    even++;
                }
            }else{
                // odd
                int judge = idx + bin;
                if(judge % 2 != 0){
                    odd++;
                }
            }
            //
            bin++;
            bin = (bin % 2);
        }


        int ans = Math.max(odd, even);

        System.out.println(ans);





    }




}
