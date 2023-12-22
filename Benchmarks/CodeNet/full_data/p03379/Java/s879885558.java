import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Numbers{
        private int N;
        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();
        Numbers(int n){ this.N = n; }

        Scanner scan = new Scanner(System.in);

        public void setX(){
                for(int i=0;i<N;i++){
                        this.X.add(scan.nextInt());
                        this.Y.add(this.X.get(i));
                }
                Collections.sort(this.Y);
        }
        public void checkY(){
                System.out.println("--- check Y ---");
                for(int i=0;i<this.getN();i++){
                        System.out.println(this.Y.get(i));
                }
                System.out.println("---------------");
        }

        public void Bi(){
                for(int i=0; i<this.getN(); i++){
                        if(this.X.get(i) > this.Y.get(this.getN() / 2 - 1)){
                                System.out.println(this.Y.get(this.getN() / 2 - 1));
                        }else{
                                System.out.println(this.Y.get(this.getN() / 2));
                        }
                }
        }
        public int getN(){ return this.N; }
}

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                Numbers numbers = new Numbers(scan.nextInt());
                numbers.setX();
                //numbers.checkY();
                numbers.Bi();
        }
}
