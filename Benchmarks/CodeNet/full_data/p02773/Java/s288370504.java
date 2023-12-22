import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //文字用
    String s[] = new String[n];
    //数える用
    int num[] = new int[n];

    for(int i = 0 ; i < n ; ++i){
      s[i] = sc.next();
      num[i] = 0;
    }
    //ソートする
    Arrays.sort(s);
    //数える用
    int count = 0;
    //多いの判断用
    int max = 0;
    
    for(int i = 0 ; i < n ; ++i){
      for(int j = i+1 ; j < n ; ++j){
        if(s[i].equals(s[j])){
          count++;
          num[j] = count;
        }else{
          break;
        }
      }
      if(i+count > i){
        i += count;
      }
      count = 0;
    }
    
    for(int i = 0 ; i < n ; ++i){
      max = Math.max(num[i],max);
    }
    
    for(int i = 0 ; i < n ; ++i){
      if(num[i] == max){
       System.out.println(s[i]);
      }

    }

    
  }
}