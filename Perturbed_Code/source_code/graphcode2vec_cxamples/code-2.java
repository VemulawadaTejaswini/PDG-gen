public static int findLowerBound(int[] inputs, int size, int v) {
    int bounder = 0;
    int l = size;
    int mindex = 0;
    while (bounder < l) {
        mindex = (bounder + l) / 2;
        if (v <= inputs[mindex]) {
            l = mindex;
        } else {
            bounder = mindex + 1;
        }
    }
    return bounder;
}
