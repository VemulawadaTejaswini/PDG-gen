import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int n = sc.nextInt();
    int a[] = new int[n];
    int x = 0;

    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int answer1[] = new int[h*w];
    for(int i=0;i<n;i++){
      for(int j=0;j<a[i];j++){
        answer1[x] = i+1;
        x = x + 1;
      }
    }
    x = 0;
    int answer2[][] = new int[h][w];
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(i%2==0){
          answer2[i][j] = answer1[x];
          x = x + 1;
        }else{
          answer2[i][w-1-j] = answer1[x];
          x = x + 1;
        }
      }
    }
      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          System.out.print(answer2[i][j] + " ");
        }
        System.out.println("");
      }

  }
}