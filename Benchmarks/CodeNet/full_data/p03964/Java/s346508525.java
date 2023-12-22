import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    long takahashi = 0l;
    long aoki = 0l;
    long t_i = 0l;
    long a_i = 0l;
    long count = 1;

    for(int i=0; i<N; i++){
      t_i = Long.parseLong(scanner.next());
      a_i = Long.parseLong(scanner.next());

      if(t_i>=takahashi && a_i>=aoki){
        takahashi = t_i;
        aoki = a_i;
      }else if(t_i<takahashi && a_i>=aoki){
        if(takahashi % t_i == 0){
          count = takahashi/t_i;
          takahashi = t_i * count;
          aoki = a_i * count;
        }else{
          count = takahashi/t_i+1;
          takahashi = t_i * count;
          aoki = a_i * count;
        }
      }else if(t_i>=takahashi && a_i<aoki){
        if(aoki % a_i == 0){
          count = aoki/a_i;
          takahashi = t_i * count;
          aoki = a_i * count;
        }else{
          count = aoki/a_i+1;
          takahashi = t_i * count;
          aoki = a_i * count;
        }
      }else{
        if(takahashi%t_i==0 && aoki%a_i==0){
          count = Math.max(takahashi/t_i, aoki/a_i);
          takahashi = t_i * count;
          aoki = a_i * count;
        }else if(takahashi%t_i!=0 && aoki%a_i==0){
          count = Math.max(takahashi/t_i+1, aoki/a_i);
          takahashi = t_i * count;
          aoki = a_i * count;
        }else if(takahashi%t_i==0 && aoki%a_i!=0){
          count = Math.max(takahashi/t_i, aoki/a_i+1);
          takahashi = t_i * count;
          aoki = a_i * count;
        }else{
          count = Math.max(takahashi/t_i+1, aoki/a_i+1);
          takahashi = t_i * count;
          aoki = a_i * count;
        }
      }
    }

    System.out.println(takahashi + aoki);
  }
}
