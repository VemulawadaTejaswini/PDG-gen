import java.util.*;
public class Main {

    private static int check(int begin, int end, int[] array){

        List<Integer> list = new ArrayList<>();
        for(int i = begin; i < end ;i++){
            if(array[i+1] != array[i]){
                list.add(i);
            }
        }

        if(list.size() == 0){
            return 0;
        }

        int b = 0;
        int count;
        int maxCount = 0;
        for(int e: list) {
            count = e - b + 1;
            if(maxCount < count) maxCount = count;
            b = e;
        }

        return (end +1 - maxCount);
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] array = new int[n];

        for(int i =0; i < n;i++){
            array[i] = Integer.parseInt(scan.next());
        }

        Arrays.sort(array);

        if(array[0] == array[n-1]) {

            System.out.println(n/2);
            return;
        }

        int ans=0;
        ans += check(0,  n/2-1, array);
        ans += check(n/2,n-1,   array);
        System.out.println(ans);
    }
}
