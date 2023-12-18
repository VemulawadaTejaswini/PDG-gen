public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int MAX_CAPA = 10000;
    int[] test;
    int i = 0;
    test = new int[MAX_CAPA];
    for(i = 0; i < MAX_CAPA; i++){
      test[i] = sc.nextInt();
      if(test[i] == 0) break; 
    }
    for(int j = 0; j < i; j++){
      System.out.printf("Case %d: %d\n", j+1, test[j]);
    }
  }
}
