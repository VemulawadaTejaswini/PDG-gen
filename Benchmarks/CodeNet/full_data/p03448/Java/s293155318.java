class Main{
  public static void main(String[] args) {
    int a = 500, b = 100, c = 50;
    int count = 0;

    int sum;
    for (int i = 0; i <= 40 ; i++) {
      a = a * i;
      sum = a;
      if(sum == 40000) {count++; break;}
      for (int j = 0; j <= 200 ; j++) {
        b = b * j;
        sum = a + b;
        if(sum == 40000) break;
        for (int k = 0; k <= 400 ; k++) {
          c = c * k;
          sum = a + b + c;
          if(sum >= 50 && sum <= 40000)count++;
        }
        count++;
      }
      count++;
    }

    System.out.println(count);
  }
}