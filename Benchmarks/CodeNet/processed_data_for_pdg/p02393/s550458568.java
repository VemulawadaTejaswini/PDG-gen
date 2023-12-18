public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b, c;
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      int arr[] = {a, b, c};
    int n = arr.length;
      for(int i = 1; i<n; i++){
      int j = i-1;
      int key = arr[i];
      while(j>=0 && key<arr[j]){
      arr[j+1] = arr[j];
      j--;
      }
      arr[j+1] = key;
      }
      System.out.println( arr[0]+ " " +arr[1]+ " " +arr[2]);
    }
    }
