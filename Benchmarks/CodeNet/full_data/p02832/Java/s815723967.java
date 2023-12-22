import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count=0;
        for(int i =0;i<n;i++){
            if(sc.nextInt()==count+1){
                count++;
            }
        }
        System.out.println(count==0?-1:n-count);
    }
}