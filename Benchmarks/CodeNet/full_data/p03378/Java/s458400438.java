import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Route{

        private int N ;
        private int M ;
        private int X ;
        ArrayList<Integer> center = new ArrayList<Integer>();
        ArrayList<Integer> chip = new ArrayList<Integer>();


        Route(int n,int m,int x){
                this.N = n;
                this.M = m;
                this.X = x;
        }

        public void addCenter(int a){
                this.center.add(a);
        }
        public void setChip(){
                for(int i=0;i<=this.N;i++){
                        if(this.center.indexOf(i) >= 0){
                                this.chip.add(1);
                        }else if(this.center.indexOf(i) == -1){
                                this.chip.add(0);
                        }
                }
        }

        public int x2zero(){
                int cost = 0;
                for(int i=this.X; i>=0; i--){
                        cost += this.chip.get(i);
                }
                return cost;
        }
        public int x2N(){
                int cost = 0;
                for(int i=this.X; i<=N; i++){
                        cost += this.chip.get(i);
                }
                return cost;
        }

        public int getN(){return this.N;}
        public int getM(){return this.M;}
        public int getX(){return this.X;}


}

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                Route route = new Route(scan.nextInt(),scan.nextInt(),scan.nextInt());
                for(int i=0;i<route.getM();i++) route.addCenter(scan.nextInt());
                route.setChip();
                int toZero = route.x2zero();
                int toN = route.x2N();

                System.out.println(Math.min(toZero,toN));

        }
}
