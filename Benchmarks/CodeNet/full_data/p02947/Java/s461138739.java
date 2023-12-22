import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;
        int ans = 0;
        int same = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] a = new String[N];
        char[] sub = new char[10];
        byte[] used = new byte[N];
        byte[] flag = new byte[10];

        for(i = 0; i < N; i++){
            a[i] = sc.next();
        }

        for(i = 0; i < N; i++){
            for(j = 0; j < 10; j++){
                sub[j] = a[i].charAt(j);
            }
            for(j = i + 1; j < N; j++){
                count = 0;
                same = 0;
                while(count != 10){
                    for(k = 0; k < 10; k++){
                        if(flag[k] == 1)    continue;
                        else if(sub[same] == a[j].charAt(k)){
                            same++;
                            flag[k] = 1;
                        }
                    }
                    count++;
                }
                if(same == 10)  ans++;
                for(k = 0; k < 10; k++) flag[k] = 0;
            }
        }
        System.out.print(ans);
    }
}