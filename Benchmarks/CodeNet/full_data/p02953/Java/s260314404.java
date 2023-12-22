import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] height = new int[n];
    for(int i = 0 ; i < n ; i++){
      height[i] = Integer.parseInt(sc.next());
    }

    boolean pos = true;
    for(int i = 0 ; i < n - 1; i++){
      if(i == 0){

        if(height[0] - height[1] >= 2){
          pos = false;
          break;
        }

      }else{

        if(height[i] - height[i + 1] >= 2){
          pos = false;
          break;
        }else if(height[i] - height[i + 1] <= 0){
          continue;
        }else if(height[i] - height[i - 1] == 0){
          pos = false;
          break;
        }else{
          height[i]--;
        }

      }
    }
    if(pos){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}