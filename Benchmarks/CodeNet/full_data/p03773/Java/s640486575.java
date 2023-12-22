import java.util.Scanner;
  Scanner scan = new Scanner(System.in);
   
  System.out.print("開始時刻");
  float a = scan.nextFloat();
  System.out.print("経過時間");
  float b = scan.nextFloat();
  scan.close();

  System.out.println("終了時間は" + (a + b) + "時です"); 
