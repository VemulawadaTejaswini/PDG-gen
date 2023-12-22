import java.util.Scanner;

/*
H  行 W 列のマス目を考えます。上から r 番目、左から c 番目のマスを(r,c) と表すことにします。
全てのマスはそれぞれ白か黒のどちらかの色に塗られています。

次のような経路が存在するとき、このマス目を"良い"状態と呼びます。

常に白いマスの上にいながら、(1,1) から、一つ 右か下 のマスに移動することを繰り返し、 
(H,W) へ移動する。
ここで、"良い"状態ならば (1,1) や(H,W) が必ず白いことに注意してください。

あなたの仕事は、以下の操作を繰り返し、マス目を"良い"状態にすることです。最小で何回操作を行う必要があるか求めてください。なお、有限回の操作で必ず"良い"状態に出来ることが証明可能です。

4 つの整数 r0,c0,r1,c1(1≤r0≤r1≤H,1≤c0≤c1≤W) を選ぶ。
r0≤r≤r1,c0≤c≤c1 を満たす全てのr,c について、(r,c) の色を変更する。
つまり、白色ならば黒色にし、黒色ならば白色にする。
*/

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        String w = s.next();

        int[] temp = new int[h];

        String []resultArray = w.split("");

        for(int i = 0; i < resultArray.length; i++){
            temp[i] = Integer.parseInt(resultArray[i]);
        }

        int result = list(temp);
        System.out.println(result);
    }

    public static int list(int[] list) {
        int temp[] = new int[list.length - 1];

        if (list.length != 1) {
            for (int i = 0; i < list.length; i++) {
                temp[i] = Math.abs(list[i] - list[i + 1]);
            }
            return list(temp);
        } else {
            return list[0];
        }
    } 
}