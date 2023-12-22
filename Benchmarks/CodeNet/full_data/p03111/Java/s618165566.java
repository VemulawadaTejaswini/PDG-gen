import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int[] l = new int[N];

        for (int i = 0; i < N; i++) {

            l[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        int ans = Integer.MAX_VALUE;

//        int[] AUsed = new int[N];
//        int[] BUsed = new int[N];
//        int[] CUsed = new int[N];
//        int[] notUsed = new int[N];
//        //        int[][][][][] array  = new int[N][N][N][N][N];
//
//        //l[i]がAをつくる時に用いられる
//        for (int i = 0; i < N; i++) {
//
//            AUsed[i] = 1;
//            //l[j]がBをつくる時に用いられる
//            for (int j = 0; j < N; j++) {
//
//                if (AUsed[j] == 1) {
//
//                    continue;
//                } else {
//
//                    BUsed[j] = 1;
//                }
//
//                //l[k]がCをつくる時に用いられる
//                for (int k = 0; k < N; k++) {
//
//                    if (AUsed[k] == 1 || BUsed[k] == 1) {
//
//                        continue;
//                    } else {
//
//                        CUsed[k] = 1;
//                    }
//
//                    int temp = CalculateUsedVallue(l, AUsed, N, A) + CalculateUsedVallue(l, BUsed, N, B)
//                            + CalculateUsedVallue(l, CUsed, N, C);
//
//                    ans = (ans > temp) ? temp : ans;
//
//                }
//
//            }
//
//        }

        int[][] memo = new int[65536][8];
        int counter = 0;

        for (int i1 = 0; i1 <= 3; i1++ ) {

            for (int i2 = 0; i2 <= 3; i2++ ) {

                for (int i3 = 0; i3 <= 3; i3++ ) {

                    for (int i4 = 0; i4 <= 3; i4++ ) {

                        for (int i5 = 0; i5 <= 3; i5++ ) {

                            for (int i6 = 0; i6 <= 3; i6++ ) {

                                for (int i7 = 0; i7 <= 3; i7++ ) {

                                    for (int i8 = 0; i8 <= 3; i8++ ) {

                                        int[] tempArray = {i1, i2, i3, i4, i5, i6, i7, i8};


                                        for(int i = 0; i < 8 ; i++) {

                                            memo[counter][i] = tempArray[i];
                                        }

                                        counter++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int[] Used : memo) {

            if (usedCheck(Used)) {

                int temp = CalculateUsedVallue(l, Used, N, A, B, C);
                ans = (ans > temp) ? temp : ans;
            } else {

                continue;
            }
        }

        System.out.println(ans);

    }

    private static int CalculateUsedVallue(int[] l, int[] Used, int N, int A, int B, int C) {
        // TODO Auto-generated method stub
        int Asum = 0;
        int Bsum = 0;
        int Csum = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {

            switch (Used[i]) {

                case 1:
                    Asum += l[i];
                    count++;
                    break;
                case 2:
                    Bsum += l[i];
                    count++;
                    break;
                case 3:
                    Csum += l[i];
                    count++;
                    break;
                default:
                    break;
            }
        }



        int ans = (count-3) * 10 + Math.abs(A - Asum) + Math.abs(B - Bsum) + Math.abs(C - Csum);

        return ans;

    }

    public static boolean usedCheck(int[] array) {

        boolean hasA = false;
        boolean hasB = false;
        boolean hasC = false;

        for(int i = 0; i < array.length; i++) {

            switch (array[i]) {

                case 1:
                    hasA = true;
                    break;
                case 2:
                    hasB = true;
                    break;
                case 3:
                    hasC = true;
                    break;
                default:
                    break;
            }

        }

        return (hasA && hasB && hasC) ? true : false;
    }

}
