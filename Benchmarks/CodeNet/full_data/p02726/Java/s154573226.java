import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int last_point = scanner.nextInt();
  	int x = scanner.nextInt();
    int y = scanner.nextInt();
    int[] routes = new int[last_point-1];
    
    for(int start_point = 1;start_point <= last_point;start_point++){
      for(int end_point = start_point + 1;end_point <= last_point;end_point++){
        routes[distance(start_point,end_point,x,y)-1]++;
      }
    }
    
    for(int i = 0;i < routes.length;i++){
      System.out.println(routes[i]);
    }
  }
  static int distance(int start,int end,int x,int y){
    int x_to_y = Math.abs(x-start)+1+Math.abs(y-end);
    int y_to_x = Math.abs(y-start)+1+Math.abs(x-end);
    return Math.min(Math.min(end-start,x_to_y),y_to_x);
  }
}