class Bingo {
  public static void Card(int args[]){
    int [] A[i][j];
    for(i = 1; i < 3; i++){
      for(j = 1; j < 3; j++) {
        A[i][j] = Math.Random() * 100;
      }
    }
  }
  
  public static void Num(int args[]) {
    int N, b;
    N = Math.Random() * 10;
    for(a = 0; a < N; a++){
      b = Math.Random() * 100;
    }
  }
  
  public static void Check(int args[]) {
    for(i = 0; i < 3; i++){
      for(j = 0; j < 3; j++) {
        if(A[i][j] == match(b)) {
          count +=1;
        }
      }
    }
  }
  
  if(count > 3) {
    System.out.println("Yes");
  } else {
    System.out.println("No");
  }
  
 
    
    
   