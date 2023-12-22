import java.util.*; 
class Main {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int sam = sc.nextInt();
       int tako[] = new int [sam];
       
       int cnt = 0;
       for(int i = 0; i < sam; i++){
           tako[i] = sc.nextInt();
       }
       
       int now = 0;
       for(int i = sam-1; i >= 0; i--){
           now = tako[i];
           for(int j = i-1; j >= 0;j--){
               cnt += tako[j] * now;
           }
       }
     System.out.print(cnt);
   }
}
