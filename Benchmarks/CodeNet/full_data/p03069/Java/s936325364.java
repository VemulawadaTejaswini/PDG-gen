import java.util.*;

public class Main {

    public static void main(String[] args) {
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int answer = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int array1[] = new int[5];
        int array2[] = new int[5];
        List<String> slist = new ArrayList<>();
        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int ruisekiwa[]=new int[N+1];
        //処理
        ruisekiwa[0]=0;
        for(int i=1;i<N+1;i++)
        {
            if(S.substring(i-1,i).equals("#"))
            {
                count++;
            }
            ruisekiwa[i]=count;
        }

        //System.out.println(Arrays.toString(ruisekiwa));

        for(int i=0;i<N+1;i++)
        {
            //System.out.println("-----"+i);
            int leftBlackCount=ruisekiwa[i]-ruisekiwa[0];
            int rightBlackCount=ruisekiwa[N]-ruisekiwa[i];
            int rightWhiteCount=N-i-rightBlackCount;
            //System.out.println("lbcount"+leftBlackCount);
            //System.out.println("rwcount"+rightWhiteCount);
            int sum=leftBlackCount+rightWhiteCount;
            //System.out.println("sum"+sum);
            if(sum<min)
            {
                min=sum;
            }
        }
        answer=min;
        //Collections.sort(a);
        //System.out.println(Arrays.toString(list1.toArray()));
        //System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.deepToString(a));
        System.out.println(answer);
    }
}
