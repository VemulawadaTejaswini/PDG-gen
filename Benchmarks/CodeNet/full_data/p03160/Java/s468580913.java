import java.util.*;

// O - Flog1
// Jul 23 2019
public class Main {

// private static final int MAX = 1000000007;

static int dist(int i, int j) {
return Math.abs(i - j);
}

class Jotai {

// public fields
public int idx;
public int delE;
public int e = 0;

public Jotai() {
}

public String toString() {
return String.format("Jotai={%d,%d,%d}", idx, delE, e);
}
}

int calc(int[] arr) {

// assert(arr.length > 1);
int len = arr.length;

// begin
Jotai j1 = new Jotai();
Jotai j2 = new Jotai();

j1.idx =0;
j1.delE = arr[0];
// j1.e += arr[0];
j2.idx =1;
j2.delE = arr[1];
j2.e += arr[1];

// exec
for (int cnt=2; cnt < len; cnt++) {
doCalc(arr[cnt], j1, j2);
}

// end
int result;
int tmp = dist(j1.delE, j2.delE);
if (j1.idx < j2.idx) {
result = Math.min(j1.e + tmp, j2.e);
} else {
result = Math.min(j2.e + tmp, j1.e);
}

return result;
}

private void doCalc(int del, Jotai j1, Jotai j2) {
// 30,40,70 OR
// 30,50,40 ..
int dist1 = dist(j1.delE, del);
int dist2 = dist(j2.delE, del);

Jotai tmpJ = j1.idx < j2.idx ? j1 : j2;
tmpJ.idx += 2;
tmpJ.delE = del;
tmpJ.e += Math.min(dist1, dist2);

}

public static void main(String[] args) {

// Scan
Scanner sc = new Scanner(System.in);

try {
// read items
int numN = sc.nextInt();
int[] arr = new int[numN];
for (int i=0; i < numN; i++) arr[i] = sc.nextInt();

// calc items
Main m = new Main();
int result = m.calc(arr);

// write items
System.out.println(result);
} finally {
if (sc != null) sc.close();
}
}
}

