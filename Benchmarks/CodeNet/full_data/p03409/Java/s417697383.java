import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<D2> red = new ArrayList<>();
        ArrayList<D2> blue = new ArrayList<>();
        for (int i = 0;i < n;++i){
            red.add(new D2(sc.nextInt(),sc.nextInt()));
        }
        for (int i = 0;i < n;++i){
            blue.add(new D2(sc.nextInt(),sc.nextInt()));
        }
        int j = search(red,blue);
        System.out.println(j);
    }

    public static int search(ArrayList<D2> red,ArrayList<D2> blue){
        int max = -1;
        for (int i = 0;i < red.size();++i){
            for (int j = 0;j < blue.size();++j){
                if(red.get(i).x < blue.get(j).x&&red.get(i).y < blue.get(j).y){
                    ArrayList<D2> rered = (ArrayList<D2>)red.clone();
                    ArrayList<D2> reblue = (ArrayList<D2>)blue.clone();
                    rered.remove(i);reblue.remove(j);
                    int k = search(rered,reblue);
                    if(k > max)max = k;
                }
            }
        }
        return max + 1;
    }

    static class D2{
        public int x,y;
        public D2(int x,int y){
            this.x = x;this.y = y;
        }
    }

}