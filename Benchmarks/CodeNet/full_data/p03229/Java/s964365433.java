import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int[] nums = new int[N];

    for (int i = 0; i < N; i++) {
      nums[i] = in.nextInt();
    }

    Arrays.sort(nums);

    /*
    int minIndex = 0;
    int maxIndex = N - 1;

    int index = N / 2;
    int maxIndex1 = index - 1;
    int maxIndex2 = index + 1;
    int minIndex1 = index - 2;
    int minIndex2 = index + 2;

    arr[index] = nums[minIndex];
    minIndex++;

    while (
      0 <= maxIndex1 ||
      0 <= minIndex1 ||
      maxIndex2 < N ||
      minIndex2 < N) {
        if (0 <= maxIndex1) {
          arr[maxIndex1] = nums[maxIndex];
          maxIndex--;
          maxIndex1 -= 2;
        }
        if (maxIndex2 < N) {
          arr[maxIndex2] = nums[maxIndex];
          maxIndex--;
          maxIndex2 += 2;
        }
        if (0 <= minIndex1) {
          arr[minIndex1] = nums[minIndex];
          minIndex++;
          minIndex1 -= 2;
        }
        if (minIndex2 < N) {
          arr[minIndex2] = nums[minIndex];
          minIndex++;
          minIndex2 += 2;
        }
      }

    long ans1 = 0;

    for (int i = 1; i < N; i++) {
      ans1 += Math.abs(arr[i] - arr[i - 1]);
    }

    minIndex = 0;
    maxIndex = N - 1;

    index = N / 2;
    maxIndex1 = index - 1;
    maxIndex2 = index + 1;
    minIndex1 = index - 2;
    minIndex2 = index + 2;

    arr[index] = nums[maxIndex];
    maxIndex--;

    while (
      0 <= maxIndex1 ||
      0 <= minIndex1 ||
      maxIndex2 < N ||
      minIndex2 < N) {
        if (0 <= maxIndex1) {
          arr[maxIndex1] = nums[maxIndex];
          maxIndex--;
          maxIndex1 -= 2;
        }
        if (maxIndex2 < N) {
          arr[maxIndex2] = nums[maxIndex];
          maxIndex--;
          maxIndex2 += 2;
        }
        if (0 <= minIndex1) {
          arr[minIndex1] = nums[minIndex];
          minIndex++;
          minIndex1 -= 2;
        }
        if (minIndex2 < N) {
          arr[minIndex2] = nums[minIndex];
          minIndex++;
          minIndex2 += 2;
        }
      }

    long ans2 = 0;

    for (int i = 1; i < N; i++) {
      ans2 += Math.abs(arr[i] - arr[i - 1]);
    }*/

    int[] arr = new int[N];
    
    putMinAtCenter(nums, arr);
    long ans1 = 0;
    for (int i = 1; i < N; i++) {
      ans1 += Math.abs(arr[i] - arr[i - 1]);
    }

    putMaxAtCenter(nums, arr);
    long ans2 = 0;
    for (int i = 1; i < N; i++) {
      ans2 += Math.abs(arr[i] - arr[i - 1]);
    }

    System.out.println(Math.max(ans1, ans2));
  }

  public static void putMinAtCenter(int[] sorted, int[] arr) {
    int N = sorted.length;
    int index = sorted.length / 2;
    arr[index] = sorted[0];

    fill(sorted, arr,
      N - 1, index - 1, index + 1,
      1, index - 2, index + 2
    );
  }

  public static void putMaxAtCenter(int[] sorted, int[] arr) {
    int N = sorted.length;
    int index = N / 2;
    arr[index] = sorted[N - 1];

    fill(sorted, arr,
      N - 2, index - 2, index + 2,
      0, index - 1, index + 1
    );
  }

  public static void fill(int[] sorted, int[] arr, 
    int maxIndex, int maxIndex1, int maxIndex2,
    int minIndex, int minIndex1, int minIndex2
  ) {
    int N = sorted.length;

    while (
      0 <= maxIndex1 ||
      0 <= minIndex1 ||
      maxIndex2 < N ||
      minIndex2 < N) {
        if (0 <= maxIndex1) {
          arr[maxIndex1] = sorted[maxIndex];
          maxIndex--;
          maxIndex1 -= 2;
        }
        if (maxIndex2 < N) {
          arr[maxIndex2] = sorted[maxIndex];
          maxIndex--;
          maxIndex2 += 2;
        }
        if (0 <= minIndex1) {
          arr[minIndex1] = sorted[minIndex];
          minIndex++;
          minIndex1 -= 2;
        }
        if (minIndex2 < N) {
          arr[minIndex2] = sorted[minIndex];
          minIndex++;
          minIndex2 += 2;
        }
      }
  }
}