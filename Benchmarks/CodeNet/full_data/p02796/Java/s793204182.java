import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] S = new int[N];
    int[] T = new int[N];
    
    for (int i = 0; i < N; i++){
      int tempX = sc.nextInt();
      int tempL = sc.nextInt();
      S[i] = tempX - tempL;
      T[i] = tempX + tempL;
    }
    
    quickSort(T,S);
    
    int ans = 1;
    int max = T[0];
    for(int i = 1; i < N; i++){      
      if (S[i] >= max){
        ans++;
        max = T[i];
      }
    }
    System.out.println(ans);
  }
                        
 public static void PartPartition(int S[],int p, int q,int T[]){  //pが左端要素番号、qが右端
      //pは大きい部分の最初の要素番号
      if (p >= q){
        return;     
      }else{ 
        int left = p; //xに左端を記憶
        int right = q;//yに右端を記憶
        for (int i = p; i < q+1; i++){
          int r = S[q]; //rは基準となる要素の値。今回は最後尾の数
          if (S[i] <= r){
            int temp = S[i];
            S[i] = S[p];
            S[p] = temp;
            temp = T[i];
            T[i] = T[p];
            T[p] = temp;            
            p++;
          }
        }
        PartPartition(S,left,p-2,T);
        PartPartition(S,p,right,T);                
    }  
  }
    public static void quickSort(int S[], int T[]){
      PartPartition(S,0,S.length-1,T);
    }

    
}
