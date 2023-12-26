public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt()+1;  
    int M = sc.nextInt();    
    int X = sc.nextInt();    
    int[] place = new int[M]; 
    int PatternA = 0;
    int PatternB = 0;
    for(int i = 0 ; i < M ; i++){
      place[i] = sc.nextInt();
    }
    for(int i = X ; i < N ; i++){ 
      for(int j = 0 ; j < place.length ; j++){
        if(i == place[j]){
          PatternA++;
        }
      }
    }
    for(int i = X ; i >= 1 ; i--){
      for(int j = 0 ; j < place.length ; j ++){
        if(i == place[j]){
        PatternB++;
        }
      }
    }
    if(PatternA < PatternB){
      System.out.println(PatternA);
    }else{
      System.out.println(PatternB);
    }
  }
}
