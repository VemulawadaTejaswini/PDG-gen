import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        String S = sc.next();
        int[] Sn = new int[N];
        List<Integer> LengthList = new ArrayList<>();

        for (int i=0; i < N; i++) {

            Sn[i] = Integer.parseInt(String.valueOf(S.charAt(i)));

            if (i == 0 || Sn[i-1] != Sn[i]) {

                if(Sn[i] == 1) {

                    LengthList.add(1);
                } else {

                    LengthList.add(-1);
                }
            } else if (i != 0 && Sn[i-1] == Sn[i]) {

                if(Sn[i] == 1) {

                    LengthList.set(LengthList.size()-1, LengthList.get(LengthList.size()-1) + 1);
                } else {

                    LengthList.set(LengthList.size()-1, LengthList.get(LengthList.size()-1) - 1);
                }
            }

        }

        sc.close();

        int sum = 0;
        int ans = 0;
        int hitZeroArray = 0;
        int i = 0;
        int j = 0;

        while ( i < LengthList.size()) {

            if (hitZeroArray < K) {

                if (LengthList.get(i) > 0) {

                    sum += LengthList.get(i);
                    i++;

                    if (i == LengthList.size()) {

                        if (ans < sum) {

                            ans = sum;
                        }
                    }
                } else {

                    sum -= LengthList.get(i);
                    hitZeroArray++;
                    i++;

                    if (i == LengthList.size()) {

                        if (ans < sum) {

                            ans = sum;
                        }
                    }
                }
            }  else {

                if (LengthList.get(i) > 0) {

                    sum += LengthList.get(i);
                }

                if (ans < sum) {

                    ans = sum;
                }
                sum = 0;

                if (LengthList.get(0) > 0) {

                    LengthList.remove(0);
                    LengthList.remove(1);

                    i = 0;
                    hitZeroArray = 0;
                } else {

                    LengthList.remove(0);
                    i = 0;
                    hitZeroArray = 0;
                }
            }

        }

        System.out.println(ans);
    }

}
