public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int kind = 0;
      Map<String, Integer> priseMap = new HashMap<>();
      for(int i = 0; i < N; i++){
        String prise = sc.next();
        if(!priseMap.containsKey(prise)){
          priseMap.put(prise, 0);
          kind++;
        }
      }
      System.out.println(kind);
    }
}
