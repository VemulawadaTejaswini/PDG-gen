import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        if(height == 1 || width == 1){
            System.out.println(1);
        }else if(height <= 2 || width <= 2){
            System.out.println(width*height/2);
        }else if(height%2 != 0 && width%2 != 0){
            System.out.println(width*height/2+1);
        }else{
            System.out.println(width*height/2);
        }
    }
}