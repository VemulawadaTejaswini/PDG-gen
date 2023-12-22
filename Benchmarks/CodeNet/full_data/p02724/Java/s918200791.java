import java.util.Scanner;

public class Main {
  private int happiness500 = 1000;
  private int happiness5 = 5;
  
  public int numOf500(int amount) {
    return amount / 500;
  }
  
  public int numOf5(int amount) {
    return (amount % 500) / 5;
  }
  
  public int calcHappiness(int largeMedal, int smallMedal) {
    return largeMedal * happiness500 + smallMedal * happiness5;
  }
  
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Main obj = new Main();
    
    int amount = Integer.parseInt(scnr.nextLine());
    
    System.out.println(obj.calcHappiness(obj.numOf500(amount), 
                                         obj.numOf5(amount)));
  }
}