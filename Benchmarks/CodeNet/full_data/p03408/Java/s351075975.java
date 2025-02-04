import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N    = scan.nextInt();
      int     m    = 1;

      int[]    Rcount = new int[100];
      String[] red    = new String[N];

      for(int i = 0; i < N; i++){
          red[i] = scan.next();
          }
      Arrays.sort(red);


      int      M      = scan.nextInt();
      int[]    Bcount = new int[M];
      String[] blue   = new String[M];
      for(int i = 0; i < M; i++){
          blue[i] = scan.next();
          }
      Arrays.sort(blue);
      for(int i = 0; i < N; i++){
          for(int j = 0; j < N; j++){
              if(red[i].equals(red[j])){
                 Rcount[i]++;
                 }
              for(int k = 0; k < M; k++){
                  if(red[i].equals(blue[k])){
                     Rcount[i]--;
                     }
                  }
              }
          }
      Arrays.sort(Rcount);
      System.out.println(Rcount[99]);
   }
}
