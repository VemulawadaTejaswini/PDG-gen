public static int getLowerBound(int v, int size, int[] inputs) {
    int h = size;
    int mindex = 0;
    int check = 0;
    while (check < h) {
        mindex = (check + h) / 2;
        if (v > inputs[mindex]) {
            check = mindex + 1;
        } else {
            h = mindex;
        }
    }
    return check;
}