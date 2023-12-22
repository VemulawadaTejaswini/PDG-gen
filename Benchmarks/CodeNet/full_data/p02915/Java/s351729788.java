import java.util.Scanner;

class password{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int i = input.nextInt();
    int count;
    int first;
    int second;
    int third;
    for(first = 1; first < i; first++){
      first = first * 100;
      for(second = 1; second < i; second++){
        second = second * 10;
        for(third = 1; third < i; third++){
          third = third * 1;
          count++;
        }
      }
    }
    
    System.out.println(count);
  }
}
