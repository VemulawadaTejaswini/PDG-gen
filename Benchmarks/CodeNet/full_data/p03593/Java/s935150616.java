import java.util.*;


public class Main {
    public static void my_add(char x, int[] sum){
        int y=x-'a';
        if(sum[y]==3)
        {
            sum[y]=0;
        }
        else{
            sum[y]++;
        }
    }
    public static int[] resres(int[] sum){
        int[] result= {0,0,0,0};
        for(int k=0;k<26;k++){
            result[sum[k]]++;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        int m = re.nextInt();
        int n = re.nextInt();
        int[] res = new int[26];
        for (int i = 0; i < m; i++) {
            String A = re.next();
            for (int j = 0; j < n; j++) {
                my_add(A.charAt(j), res);
            }
        }
        int[] oh = resres(res);
        if (m == 1 || n == 1) {
            if (oh[1] + oh[3] <= 1) {
                System.out.println("Yes");

            } else {
                System.out.println("No");
            }
        } else {
            if (m % 2 == 0) {
                if (n % 2 == 0) {
                    if (((oh[1] == 0) && (oh[2] == 0) && (oh[3] == 0))) {
                        System.out.println("Yes");

                    } else {
                        System.out.println("No");
                    }
                } else {
                    if (oh[1] + oh[3] > 1) {
                        System.out.println("No");
                    } else {
                        if (oh[2] +oh[3]> m / 2) {
                            System.out.println("No");
                        } else {
                            System.out.println("Yes");
                        }
                    }
                }

            } else {
                if (n % 2 == 1) {
                    if (oh[1] + oh[3] < 1 && oh[2] + oh[3] < (m + n - 2) / 2) {
                        System.out.println("Yes");

                    } else {
                        System.out.println("No");
                    }
                } else {
                    if (oh[1] + oh[3] > 1) {
                        System.out.println("No");
                    } else {
                        if (oh[2] +oh[3]> n / 2) {
                            System.out.println("No");
                        } else {
                            System.out.println("Yes");
                        }
                    }
                }
            }

        }

    }}