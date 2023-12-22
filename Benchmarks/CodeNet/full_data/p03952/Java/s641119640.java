

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        if (N ==x){
            System.out.println("Yes");
            int tmp = 2*N;
            for(int i=1;i<tmp;i++) {
                System.out.println(i);
            }
        }
        else{
            if((x==1)||(x==2*N-1)){
                System.out.println("No");
            }
            else{
                if(N==3&&x==4){
                    System.out.println(1);
                    System.out.println(4);
                    System.out.println(5);
                    System.out.println(2);
                    System.out.println(3);
                }
                else if(N==3&&x==2){
                    System.out.println(5);
                    System.out.println(2);
                    System.out.println(1);
                    System.out.println(3);
                    System.out.println(4);
                }
                else{
                    if(x==2||x==2*N-2){
                        System.out.println("No");
                    }
                    else {
                        System.out.println("Yes");
                        List<Integer> list = new LinkedList<>();
                        list.add(x - 2);
                        list.add(x + 2);
                        list.add(x);
                        list.add(x - 1);
                        list.add(x + 1);
                        int cnt = 0;
                        for (int i = 0; i < 2 * N - 1; i++) {
                            if ((i < x - 2) || (i > x + 2)) {
                                if (cnt < (2 * N - 1 - 5) / 2) {
                                    list.add(0, i);
                                    cnt++;
                                } else {
                                    list.add(i);
                                }
                            }
                        }
                        for (int i = 0; i < 2 * N - 1; i++) {
                            System.out.println(list.get(i));

                        }
                    }
                    
                }
            }
            
            
        }

        sc.close();

    }

 }
