public class Main {
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    int Y = Integer.parseInt(args[1]);

    int Yukichi, Higuchi, Noguchi;
    boolean flag = false;

    for(Yukichi = 0; Yukichi <= Y; Yukichi++){
      for(Higuchi = 0; Yukichi + Higuchi <= Y; Higuchi++){
        Noguchi = N - (Yukichi + Higuchi);
        int num = 10000*Yukichi + 5000*Higuchi + 1000*Noguchi;
        if(num == N)
          flag = true;
          break;
      }
    }
    if(flag)
      System.out.println(Yukichi +" "+ Higuchi +" "+ Noguchi);
    else
      System.out.println(-1 +" "+ -1 +" "+ -1);
  }
}