import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String S = in.next();
        int[] right = new int[26];
        for(int i=0;i<N;i++){
            right[S.charAt(i)-'a']++;
        }
        int[] left=new int[26];
        int result = Integer.MIN_VALUE;
        for(int j=0;j<N-1;j++){
            char cur = S.charAt(j);
            left[cur-'a']++;
            right[cur-'a']--;
            int sum=0;
            for(int k=0;k<26;k++){
                if(left[k]>0&&right[k]>0) sum++;
            }
            result = Math.max(result,sum);
        }
        System.out.println(result);

    }
}