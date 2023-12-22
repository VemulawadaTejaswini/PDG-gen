//いろはちゃんとマス目  
  //座標(H-W-1,B+1)を点Pとしそこを通る組み合わせを計算
  //座標(H-W-1+x,B+1)における組み合わせを合算

import java.util.*;

public class Main {
  static int H,W,A,B;
  static int p,p1,p2,total;
  static int pa,p1aa,p1ab,p1a,p2a;
  static int pb,p1ba,p1bb,p1b,p2b;
  
  //漸化式による組合せ(nCr)の計算
  public static int calcNumOfCombination(int n, int r){
    int num = 1;
    for(int i = 1; i <= r; i++){
      num = num * (n - i + 1) / i;
      }
      return num;
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();
    
    p1 =calcNumOfCombination(H-A+B-1,B);
    p2 =calcNumOfCombination(A+W-B-1,A); 
    p = p1 * p2; //点Pにおける組み合わせ
    total += p;
    
    for (int i=0; i<W-B; i++) {
    p1aa =calcNumOfCombination(H-A+B+i,H-A-1);
    p1ab =calcNumOfCombination(H-A+B-1+i,H-A-1); 
    p1a = p1aa - p1ab;
    p2a = calcNumOfCombination(W-B+A-2-i,A);
    pa = p1a * p2a;
    total += pa;
    }
    
    System.out.println(total);
  }
}