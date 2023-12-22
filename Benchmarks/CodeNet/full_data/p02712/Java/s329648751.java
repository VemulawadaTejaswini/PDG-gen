import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long count = 0;
        for(int i =1 ;i < num+1; i++){
            if(i % 3l == 0l && i % 5l == 0l){
            }else if(i % 3l == 0l){
            }else if(i % 5l == 0l){
            }else{
                count += i;
            }
        }
        System.out.println(count);
    }
}