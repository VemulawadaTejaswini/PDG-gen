import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [][] list = new int[3][3];
    int [] a_list = new int[3];
    int [] b_list = new int[3];
    int max_a = 0;
    for(int a=0;a<3;a++) {
        a_list[a] = 0;
        b_list[a] = 0;
        for (int b = 0; b < 3; b++) {
            list[a][b] = sc.nextInt();
            if(a==0&&max_a<=list[a][b]){
                max_a = list[a][b];
            }
        }
    }
    for(int a=0;a<max_a;a++){
        for(int b=0;b<3;b++){
            a_list[b]=0;
            b_list[b]=0;
        }
        a_list[0] =a;
        for(int b=0;b<3;b++){
            b_list[b]=list[0][b] - a_list[0];
            if(b_list[b]<0) break;
        }
        a_list[1] = list[1][0]-b_list[0];
        a_list[2] = list[2][0]-b_list[0];
        if(a_list[1]<0||a_list[2]<0) continue;
        for(int b=1;b<3;b++){
            if(list[b][1]!= a_list[b]+b_list[1]) break;
            if(list[b][2] != a_list[b] + b_list[2])break;
            if(b==2) a= max_a+10;
            }
            if(a==max_a+10) {
            System.out.println("Yes");
            break;
        }
        if(a==max_a-1) System.out.println("No");
    }
    }

}
