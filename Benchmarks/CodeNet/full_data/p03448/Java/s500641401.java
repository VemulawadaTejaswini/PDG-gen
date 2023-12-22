import java.util.*;
 
public class Main81B{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int count =0;
    for(int a= 0; A <a; a++ ){
        for(int b =0; B <b; b++){
            int c = (X - a*500 - b*100)/50;
            if(c<=C && c>= 0){
                count++;
            }
        }
    }
        System.out.println(count);
        sc.close();
    }    
}
