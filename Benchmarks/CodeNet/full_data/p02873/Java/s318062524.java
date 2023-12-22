import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    
    int sum = 0;
    char tmp = line.charAt(0);
    char right = '>';
    int count = 0;
    for(int i = 0; i < line.length(); i++){
      	if(tmp == line.charAt(i)) count++;
      	else{
          if(tmp == right)
            sum += calcSum(0, count, count+1);
          else
            sum += calcSum(0, count, count);
          tmp = line.charAt(i);
          count = 1;
        }
    }
    

    if(tmp == right)
      sum += calcSum(0, count, count+1);
    else
      sum += calcSum(0, count+1, count);
    System.out.println(sum);
  }
  
  static int calcSum(int a, int l, int n){
    return n*(a+l)/2;
  }
}