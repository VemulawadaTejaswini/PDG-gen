import java.util.*;

public class Main implements Runnable { //Runnableを実装する
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }
    
    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Blue = Integer.parseInt(sc.next());
        int Red = Integer.parseInt(sc.next());
        int count = 0;
        
        int BR = Blue+Red;
        int wari = N/BR;
        if(wari>0){
            count += wari*Blue;
        }
  		wari = 0;
        int amari = N%BR;
        if(amari!=0 && amari>=Blue){
            count += Blue;
        }
        if(amari!=0 && amari<Blue){
            count += amari;
        }
      	amari = 0;
        System.out.println(count);
    }
}
