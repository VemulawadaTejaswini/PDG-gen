public class Main {
  public static void main(String[] args) {
    int X = 0;
    int Y = 0;
    int i1 = 0;
    int i2 = 0;
    if (X == 1) {
      i1 = 300000;
    }else if(X == 2) {
      i1 = 200000;
    }else if(X == 3) {
      i1 = 100000;
    }
    
    if (Y == 1) {
      i2 = 300000;
    }else if(Y == 2) {
      i2 = 200000;
    }else if(Y == 3) {
      i2 = 100000;
    }
    
    if (X == 1 && Y == 1) {
      int shoukin = i1 + i2 + 400000;
    }else{
      int shoukin = i1 + i2;
    }
  }
 }
      