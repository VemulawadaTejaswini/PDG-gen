import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int as[] = new int[n];
        for (int i=0; i<n; i++){
            as[i] = scanner.nextInt();
        }

        int result = n; //同じものは予め数えとく。

        int lastBefore = -1;
        for (int begin=0; begin<n-1; begin++){

            int sum = as[begin];
            int end;
            for (end = begin+1; end<n && (sum+as[end])==(sum^as[end]); end++){
                sum += as[end];
            }
            int last = end-1;

            if (last == begin){
                lastBefore=last;
                continue;
            }
            int locRes = 0;
            if (lastBefore>=begin){
                locRes+= (last-lastBefore)*(lastBefore-begin+1);
                if (last>=lastBefore+1){
                    locRes+= (last-lastBefore)*(last-lastBefore-1)/2;
                }
            }else {
                locRes+=(last-begin+1)*(last-begin)/2;
            }
            result+=locRes;
            lastBefore = last;
        }

        System.out.println(result);
    }

}
