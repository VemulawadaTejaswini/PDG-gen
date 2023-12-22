import java.util.*; 
class Main {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int sam = sc.nextInt();
       char mon [] = new char[sam];
       String ss = sc.next();
       
       mon[0] = ss.charAt(1);
       int cnt = 0;
       char cc = 'a';
       for(int i = 1; i < sam; i++){
           cc = ss.charAt(i);
           if(mon[cnt] != cc){
               cnt++;
               mon[cnt] = cc;
           }
       }
     
     System.out.print(cnt+1);
   }
}
