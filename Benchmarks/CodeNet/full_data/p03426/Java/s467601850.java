import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Numbers{

        private int number,x,y;

        public Numbers(int number,int x,int y){
                this.number = number;
                this.x = x;
                this.y = y;
        }

        public int getNumber(){
                return number;
        }
        public int getX(){
                return x;
        }
        public int getY(){
                return y;
        }
}

class Mycomp implements Comparator<Numbers>{
        public int compare(Numbers n1,Numbers n2){
                if(n1.getNumber() < n2.getNumber()){
                        return -1;
                }else{
                        return 1;
                }
        }
}

class Main{
        public static void main(String args[]){

        //load input
                Scanner scan = new Scanner(System.in);
                int H = scan.nextInt();
                int W = scan.nextInt();
                int D = scan.nextInt();

                int A[][] = new int[H][W];
                int i,j,k;
                for(i = 0; i < H; i ++)
                        for(j = 0; j < W; j ++)
                                A[i][j] = scan.nextInt();

                int Q = scan.nextInt();

                ArrayList<Integer> L = new ArrayList<Integer>();
                ArrayList<Integer> R = new ArrayList<Integer>();

                for(i=0;i<Q;i++){
                        L.add(scan.nextInt());
                        R.add(scan.nextInt());
                }


                //System.out.println("InputSuccesed.");
        /*
        //check output
                System.out.println(H+" "+W+" "+D);
                for(i = 0; i < H; i ++){
                        for(j = 0; j < W; j ++){
                                System.out.print(A[i][j]+" ");
                        }
                        System.out.println(" ");
                }
                System.out.println(Q);
                for(i=0;i<Q;i++){
                        System.out.println(L.get(i)+" "+R.get(i));
                }
        */
                int MP,d;
                //ArrayList<Integer> x = new ArrayList<Integer>();
                //ArrayList<Integer> y = new ArrayList<Integer>();
                //ArrayList<Integer> number = new ArrayList<Integer>();
                ArrayList<Numbers> step = new ArrayList<Numbers>();
                //System.out.println("List x,y was generated.");

                for(i=0;i<Q;i++){
                        MP = 0;
                        for(j = 0; j < H; j ++){
                                for(k = 0; k < W; k ++){
                                        for(d=0;;d++){
                                                if(A[j][k] == L.get(i) + d * D){
                                                        step.add(new Numbers(A[j][k],j,k));
                                                        break;
                                                }
                                                if(R.get(i) == L.get(i) + d * D)break;
                                        }
                                }
                        }

                        Collections.sort(step, new Mycomp());

                        //for(Numbers c : step)System.out.println(c.getNumber()+" : "+c.getX()+","+c.getY());
                        int x = 0;
                        int y = 0;
                        int count = 0;
                        //System.out.println("+++++");
                        for(Numbers c : step){
                                if(count!=0)MP += Math.abs( c.getX() - x ) + Math.abs( c.getY() - y );
                                //System.out.println( Math.abs( x - c.getX() ) + Math.abs( y - c.getY() ));
                                x = c.getX();
                                y = c.getY();
                                count ++;
                        }
                        //System.out.println("+++++");
                        //MP -= step.get
                        System.out.println(MP);
                        //System.out.println("step.getX(0) = "+step.getX(0));
                        //System.out.println("-----------------");
                        step = new ArrayList<Numbers>();
                }
        }
}
