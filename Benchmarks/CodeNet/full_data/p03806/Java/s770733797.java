import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{

        public static String binary(int max,int n){
                String bin = Integer.toBinaryString(n);
                String s = "";
                for(int i=0; i < (max - bin.length()); i++){
                        s += "0";
                }
                s += bin;
                return s;
        }

        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int Ma = sc.nextInt();
                int Mb = sc.nextInt();
                Med[] med;
                med = new Med[N];
                for(int i = 0; i < N; i ++){
                        med[i] = new Med();
                        med[i].a = sc.nextInt();
                        med[i].b = sc.nextInt();
                        med[i].c = sc.nextInt();
                }

                //check
                /*
                System.out.println("\n\n"+N+" "+Ma+" "+Mb);
                for(Med m : med){
                        System.out.println(m.a+" "+m.b+" "+m.c);
                } */
                //check

                Arrays.sort(med,new Comparator1());

                //check
                    /*
                System.out.println("\n\n"+N+" "+Ma+" "+Mb);
                for(Med m : med){
                        System.out.println(m.a+" "+m.b+" "+m.c+" "+m.getP());
                }   */
                //check
                ArrayList<Integer> costList = new ArrayList<Integer>();
                Cart cart = new Cart();
                String bin;
                for(int i = 1; i < Math.pow(2,N); i ++){
                        bin = binary(N,i);
                //      System.out.println(bin);//check
                        for(int j = 0; j < N; j++){ //いくつ買うか？
                                if(bin.charAt(j)=='1'){
                                        cart.buy(med[j]);
                //                      System.out.println("med["+(j+1)+"] --- cost : "+med[j].c); //check
                                }
                        }
                        if(cart.checkCart(Ma,Mb)){
                                costList.add(cart.cost);
                //              System.out.println("Buy!! cost = "+cart.cost);//check
                        }
                        cart = new Cart();
                }
                if(costList.size()==0){
                        System.out.println(-1);
                }else{
                        int min=40001;
                        for(int i = 0; i < costList.size(); i ++){
                                min = Math.min(min,costList.get(i));
                        }
                        //System.out.print("min cost = ");
                        System.out.println(min);
                }
        }
}

class Cart{
        ArrayList<Med> cart;
        int cost;
        int Ag,Bg;
        boolean end;
        Cart(){
                this.cart = new ArrayList<Med>();
                this.cost = 0;
                this.Ag = 0;
                this.Bg = 0;
        }
        void buy(Med m){
                this.cart.add(m);
                this.Ag += m.a;
                this.Bg += m.b;
                this.cost += m.c;
        }
        double getP(){
                return (double)Ag / (double)Bg;
        }
        boolean checkCart(int Ma,int Mb){
                boolean ch = Ma * this.Bg == Mb * this.Ag;
                return ch;
        }
}

class Med{
        int a,b,c;
        boolean inCart = false;
        double getP(){
                return (double)a / (double)b;
        }
}

class Comparator1 implements Comparator<Med>{
        @Override
        public int compare(Med med1,Med med2){
                return Double.compare(med1.getP(),med2.getP());
        }
}
