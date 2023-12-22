import java.util.*;
import java.math.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String inputS = sc.next();
        int inputI = sc.nextInt();
      
      
      // inputI分、inputSを繰り返す
      String mojiretu = "";
      int i = 0;
      
      while(i<inputI){
        mojiretu = mojiretu + inputS;
        i++;
      }
      
      // 文字列を変換する
      int j = 0;
      int mojisu = mojiretu.length() - 1;
      String mojiretuChange = mojiretu.substring(0,1);
      String one = "";
      String two = "";
      int answer = 0;
 
      while(j < mojisu){
        one = mojiretuChange.substring(j,j+1);
        two = mojiretu.substring(j+1,j+2);

//        System.out.println(one);
//        System.out.println(two);

        if(one.equals(two)){
          mojiretuChange = mojiretuChange.concat(" ");
          answer++;
        }else{
          mojiretuChange = mojiretuChange.concat(two);
        }
//        System.out.println(mojiretuChange);

        j++;
      }
      
//        System.out.println("/////////////");
//        System.out.println(inputS);
//        System.out.println(inputI);
//        System.out.println(mojiretu);
//        System.out.println(mojiretuChange);
        System.out.println(answer);
    }
}