import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge = sc.nextInt();
        char array[] = new char[hoge];
        String a = sc.next();
        int flag = 0;
        for(int i = 0; i < hoge; i++){
            array[i] = a.charAt(i);
        }
        if (hoge % 2 != 0){
            flag = 1;
        }else{
            for(int i = 0; i < hoge/2; i++){
                if(array[i] != array[hoge/2+i]){
                    flag = 1;
                }
            }
        }
        if(flag == 1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }    
    }     
}