import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //sc.nextLine();
        //sc.close();
        String[] a  = str.split(" ");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        
        int[] l = new int[m+1];
        int[] r = new int[m+1];
        int ans = 0;
        for ( int j = 1; j <= m; j++ ){
            String str1 = sc.nextLine();
            String[] a1  = str1.split(" ");
            l[j] = Integer.parseInt(a1[0]);
            r[j] = Integer.parseInt(a1[1]);
        }

        for ( int i = 1; i <= n; i++ ){
            boolean isOK = true;
            for ( int j = 1; j <= m; j++){
                if( i >=l[j] && i <= r[j] ){
                } else {
                    isOK = false;
                    break;
                }
            }
            if(isOK == true){
                ans++;
            }
        }
        System.out.println(ans);
    } 
}  