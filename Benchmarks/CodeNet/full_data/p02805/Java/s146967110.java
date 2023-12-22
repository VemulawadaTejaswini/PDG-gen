import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                double[] x = new double[n];
                double[] y = new double[n];
                for(int i = 0 ; i < n ; i++){
                        x[i] = sc.nextDouble();
                        y[i] = sc.nextDouble();
                }
                double yono = 100000;
                sc.close();
                for(int i = 0 ; i < n ; i++){//直径として全部入っている場合
                        for(int j = 0 ; j < i ; j++){
                                boolean ebishu = true;//全ての点が円の中に入っているかどうか
                                for(int k = 0 ; k < n && ebishu ; k++){
                                        if((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) < (x[j] + x[i] - 2 * x[k]) * (x[j] + x[i] - 2 * x[k]) + (y[j] + y[i] - 2 * y[k]) * (y[j] + y[i] - 2 * y[k])) ebishu = false;
                                }
                                if(ebishu) yono = Math.min(yono , Math.sqrt(((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j])) / 4.0));
                        }
                }
                double px = 0 , py = 0;
                for(int i = 0 ; i < n ; i++){//3点を通る円の直径と中心の座標を求める
                        for(int j = 0 ; j < i ; j++){
                                for(int k = 0 ; k < j ; k++){
                                        if((x[k] - x[i]) * (y[j] - y[i]) != (x[j] - x[i]) * (y[k] - y[i])){
                                                py = ((x[k] - x[i]) * (x[i] * x[i] + y[i] * y[i] - x[j] * x[j] - y[j] * y[j]) - (x[j] - x[i]) * (x[i] * x[i] + y[i] * y[i] - x[k] * x[k] - y[k] * y[k])) / 2.0 / ((x[k] - x[i]) * (y[i] - y[j]) - (x[j] - x[i]) * (y[i] - y[k]));
                                                if(x[j] == x[i]){
                                                        px = (2 * (y[i] - y[k]) * ((x[k] - x[i]) * (x[i] * x[i] + y[i] * y[i] - x[j] * x[j] - y[j] * y[j]) - (x[j] - x[i]) * (x[i] * x[i] + y[i] * y[i] - x[k] * x[k] - y[k] * y[k])) / 2.0 / ((x[k] - x[i]) * (y[i] - y[j]) - (x[j] - x[i]) * (y[i] - y[k])) - x[i] * x[i] - y[i] * y[i] + x[k] * x[k] + y[k] * y[k]) / 2.0 / (x[k] - x[i]);
                                                }else{
                                                        px = (2 * (y[i] - y[j]) * ((x[k] - x[i]) * (x[i] * x[i] + y[i] * y[i] - x[j] * x[j] - y[j] * y[j]) - (x[j] - x[i]) * (x[i] * x[i] + y[i] * y[i] - x[k] * x[k] - y[k] * y[k])) / 2.0 / ((x[k] - x[i]) * (y[i] - y[j]) - (x[j] - x[i]) * (y[i] - y[k])) - x[i] * x[i] - y[i] * y[i] + x[j] * x[j] + y[j] * y[j]) / 2.0 / (x[j] - x[i]);
                                                }
                                                boolean ebi = true;
                                                for(int l = 0 ; l < n && ebi ; l++){
                                                        if((x[i] - px) * (x[i] - px) + (y[i] - py) * (y[i] - py) < (x[l] - px) * (x[l] - px) + (y[l] - py) * (y[l] - py)) ebi = false;
                                                }
                                                if(ebi) yono = Math.min(yono , Math.sqrt((x[i] - px) * (x[i] - px) + (y[i] - py) * (y[i] - py)));
                                        }
                                }
                        }
                }
                System.out.println(yono);
        }
}