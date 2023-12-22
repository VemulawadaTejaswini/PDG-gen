import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//3
        int box = a;
        int b = sc.nextInt();//5
        int t = sc.nextInt();//7
        int count = 1;
        int c = a;
        t += 1;//t=8
        ArrayList<Integer> time = new ArrayList<>();
        while(count <= 20){//3,6,9,...
            time.add(c);//
            ++count;
            c = a * count;
        }//time=3,6
        int countTime = 0;

        for(int x : time){//3>7F,6>7F,9>7T,
            if(x > t){
                break;
            }else{
                ++countTime;
            }
        }
        a = box;
        if(a < t){
            System.out.println(countTime * b);
        }else{
            System.out.println(0);
        }
    }
}