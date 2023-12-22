import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s[] = new String[n];
        String march = "MARCH";
        int[] d = new int[5];
        for(int i=0;i<n;i++){
            s[i] = scanner.next();
            for(int j=0;j<5;j++){
                if(s[i].charAt(0) == march.charAt(j)){
                    d[j]++;
                    break;
                }
            }
        }

        int[] x = {0,0,0,0,0,0,1,1,1,2};
        int[] y = {1,1,1,2,2,3,2,2,3,3};
        int[] z = {2,3,4,3,4,4,3,4,4,4};
        int allCount = 0;
        for(int i=0;i<10;i++){
            allCount += d[x[i]] * d[y[i]] * d[z[i]];
        }
        System.out.println(allCount);
    }

}