import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        boolean[][] a = new boolean[n][20];
        for(int i=0;i<n;i++){
            int arg = Integer.parseInt(sc.next());
            a[i] = fillZero(arg);
        } 
        int cnt = n;
        for(int i=0;i<n-1;i++){
            boolean can = true;
            boolean[] sum = a[i].clone();
            for(int j=i+1;j<n;j++){
                for(int k=0;k<20;k++){
                    if(!(sum[k] && a[j][k])){
                        sum[k] = sum[k] ^ a[j][k];
                        continue;
                    }
                    can = false;
                    break;
                }
                if(can){
                    cnt++;
                    continue;
                }
                break;
            }
        }
        System.out.println(cnt);
        
    }
    private static boolean[] fillZero(int a){
        boolean[] result = new boolean[20];
        StringBuilder builder = new StringBuilder();
        builder.append(Integer.toBinaryString(a)).reverse();
        char[] arg = builder.toString().toCharArray();
        for(int i=0;i<arg.length;i++){
            result[i] = arg[i]=='1';
        }
        for(int i=arg.length;i<20;i++){
            result[i] = false;
        }
        return result;
    }
}