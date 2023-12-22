import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //入力値
    int x = sc.nextInt();
    //int count = 0;
    //買える個数
    int buy = x/100;
    //端数
    int rmd = x%100;
    
    //買い物してみる
    for(int i = 0 ; i<buy ; ++i){
      if(rmd>=5){
        rmd -=5;
      }else if(rmd>=4){
        rmd -=4;
      }else if(rmd>=3){
        rmd -=3;
      }else if(rmd>=2){
        rmd -=2;
      }else if(rmd>=1){
        rmd -=1;
      }
    }
    
    if(rmd==0){
      System.out.println(1);
    }else{
      System.out.println(0);
    }

  }
}