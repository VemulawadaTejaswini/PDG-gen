import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] ch = new int[n];
        int r = 0;
        int g = 0;
        int b = 0;
        for(int i = 0; i < n ;i++){
            ch[i] = s.charAt(i);
            if(ch[i] == 'R'){
              r++;
            }else if(ch[i] == 'G'){
              g++;
            }else{
              b++;
            }
        }
        long ans = r * g * b;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
              int k = j + j - i;
              if(k < n && ch[i] != ch[j] && ch[i] != ch[k] && ch[j] != ch[k]){
                ans--;
              }
            }
          }
          System.out.println(ans);
    }
}
