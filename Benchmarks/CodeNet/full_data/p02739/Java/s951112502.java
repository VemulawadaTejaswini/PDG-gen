import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();

        //引っかかるところを探す
        boolean a[] = new boolean[1 << n];
        for(int i = 0 ; i < (1 << n) ; i++){
            a[i] = str[i] == '0';
        }

        boolean pick[] = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            pick[i] = a[1 << i];
        }

        boolean ans = true;
        for(int i = 0 ; i < (1 << n) ; i++){
            for(int j = 0 ; j < n ; j++){
                if(((i >> j)&1) == 1){
                    if(pick[j] && !a[i]){
                        ans = false;
                    }
                }
            }
        }

        System.out.println(ans?"Possible":"Impossible");
        boolean prev = false;
        int l = 0;

        if(ans){
            for(int i = 0 ; i < n ; i++){
                if(prev){
                    if(pick[i]){
                        l++;
                    }else{
                        l++;
                        l++;
                    }
                }else{
                    if(pick[i]){
                        l++;
                        l++;
                    }else{
                        l++;
                    }
                }
                prev = pick[i];
            }

            for(int i = prev?n:n-1 ; i >= 0 ; i--){
                l++;
            }

            System.out.println(l);
            System.out.println("0 0");
            for(int i = 0 ; i < n ; i++){
                if(prev){
                    if(pick[i]){
                        System.out.println(""+(i+1)+" 1");
                    }else{
                        System.out.println(""+(i)+" 0");
                        System.out.println(""+(i+1)+" 0");
                    }
                }else{
                    if(pick[i]){
                        System.out.println(""+(i)+" 1");
                        System.out.println(""+(i+1)+" 1");
                    }else{
                        System.out.println(""+(i+1)+" 0");
                    }
                }
                prev = pick[i];
            }

            for(int i = prev?n:n-1 ; i >= 0 ; i--){
                System.out.println(""+i+" 0");
            }
        }
    }
}
