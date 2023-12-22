class Main {
    static class Range {
        int l;
        int r;
        boolean flag = true;

        Range(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public String toString() {
            return "Range{" +
                    "l=" + l +
                    ", r=" + r +
                    '}';
        }
    }

    public static void main(String[] args) {
        new Main().start();
    }
    private Range[] arrayL;
    private Range[] arrayR;
    private int indexL = 0;
    private int indexR = 0;
    public void start() {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        arrayL = new Range[N];
        arrayR = new Range[N];
        for (int i = 0; i < N; ++i) {
            String[] work = scanner.nextLine().split(" ");
            Range range = new Range(Integer.parseInt(work[0]), Integer.parseInt(work[1]));
            arrayL[i] = range;
            arrayR[i] = range;
        }
        Arrays.sort(arrayL, new Comparator<Range>() {
            @Override
            public int compare(Range o1, Range o2) {
                if (o2.l != o1.l) return o2.l - o1.l;
                return o2.r - o1.r;
            }
        });
        Arrays.sort(arrayR, new Comparator<Range>() {
            @Override
            public int compare(Range o1, Range o2) {
                if (o2.r != o1.r) return o1.r - o2.r;
                return o1.r - o2.r;
            }
        });

        boolean moveLeft = arrayL[0].l > (arrayR[0].r * -1);
        int current = 0;
        int total = 0;

        while (true) {
            if (moveLeft) {
                while (indexL < arrayL.length) {
                    Range range = arrayL[indexL];
                    if (range.flag) {
                        range.flag = false;
                        if (current < range.l) {
                            total += range.l - current;
                            current = range.l;
                        } else if (current > range.r) {
                            total += current - range.r;
                            current = range.r;
                        }
                        ++indexL;
                        break;
                    } else {
                        ++indexL;
                    }
                }
                moveLeft = false;
                if (indexL >= arrayL.length) {
                    if (current > 0) {
                        total += current;
                    } else {
                        total -= current;
                    }
                    break;
                }
            } else {
                while (indexR < arrayR.length) {
                    Range range = arrayR[indexR];
                    if (range.flag) {
                        range.flag = false;
                        if (current > range.r) {
                            total += current - range.r;
                            current = range.r;
                        } else if (current < range.l) {
                            total += range.l - current;
                            current = range.l;
                        }
                        ++indexR;
                        break;
                    } else {
                        ++indexR;
                    }
                }
                moveLeft = true;
                if (indexR >= arrayR.length) {
                    if (current > 0) {
                        total += current;
                    } else {
                        total -= current;
                    }
                    break;
                }
            }
        }

        System.out.println(total);
    }
}