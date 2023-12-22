import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];

        for (int i = 0; i < N; ++i) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        boolean yes = true;
        for (int i = 0; i < N; ++i) {
            if (array[i] != i + 1) {
                i = check(array, i);
                if (i < 0) {
                    yes = false;
                    break;
                }
            }
        }

        System.out.println(yes ? "Yes" : "No");
    }

    private static int check(int[] array, int i) {
        int max = array[i];
        int start = i + 1;

        for (int j = 1; i + j < array.length; ++j) {
            if (j % 2 == 0) {
                int t = array[j + i];

                if ((t - start) % 2 == 0) {
                    if (t < start) {
                        return -1;
                    } else if (t > max) {
                        max = t;
                    } else if (i + j + 1 == max) {
                        return max - 1;
                    }
                } else {
                    return -1;
                }
            } else {
                if (array[j + i] != i + j + 1) {
                    return -1;
                }
            }
        }

        return -1;
    }
}