import java.util.Scanner;
import java.math.*;

class C_62_ChocolateBar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long hight = sc.nextLong();
        long width = sc.nextLong();

        long recA, recB, recC;
        long dif = hight * width;

        if (hight % 3 == 0 || width % 3 == 0) {
            // System.out.println("DEBUG:if true");
            // System.out.println("DEBUG:" + hight);
            // System.out.println("DEBUG:" + width + "\n");

            System.out.println(0);
        } else {
            // System.out.println("DEBUG:if false");
            // slice
            long diffVar = hight * width;
            long diffHor = hight * width;
            if (hight > 2) {
                diffVar = calcSliceDiff(hight, width);
            }

            if (width > 2) {
                diffHor = calcSliceDiff(width, hight);
            }

            long mindiff = Math.min(diffVar, diffHor);

            // System.out.println("sliceDiff:" + mindiff);

            boolean outputFlg = false;

            for (int i = 1; i < hight; i++) {
                long diffTVar = calcTriangleDiff(hight, width, i);
                mindiff = Math.min(mindiff, diffTVar);
            }

            for (int i = 1; i < width; i++) {
                long diffTHor = calcTriangleDiff(hight, width, i);
                mindiff = Math.min(mindiff, diffTHor);
            }

            // mindiff = calcTriangleDiff(100000, 100000, 33333);

            System.out.println(mindiff);

        }
    }

    private static long calcSliceDiff(long sliceSide, long longSide) {
        long minDiff;

        long aSide = sliceSide / 3;
        long bSide = (sliceSide - aSide) / 2;
        long cSide = sliceSide - aSide - bSide;

        long minSide = Math.min(Math.min(aSide, bSide), cSide);
        long maxSide = Math.max(Math.max(aSide, bSide), cSide);
        long diffSide = maxSide - minSide;

        // System.out.println("diffSide" + diffSide);

        minDiff = diffSide * longSide;
        // System.out.println("diffSide" + diffSide);
        // System.out.println("longSide" + longSide);
        // System.out.println("minDiff" + minDiff);
        // System.out.println("minDiff2:" + (long) diffSide * (long) longSide);

        return minDiff;
    }

    private static long calcTriangleDiff(long mainSide, long subSide, long index) {
        long diff;
        long h = mainSide - index;
        long w = subSide / 2;

        // System.out.println("h: " + h + " w: " + w);

        long recA = subSide * index;
        long recB = h * w;
        long recC = h * (subSide - w);

        // System.out.println("recA: " + recA);
        // System.out.println("recB: " + recB);
        // System.out.println("recC: " + recC);

        long maxRec = Math.max(Math.max(recA, recB), recC);
        long minRec = Math.min(Math.min(recA, recB), recC);

        diff = maxRec - minRec;

        return diff;
    }

}
