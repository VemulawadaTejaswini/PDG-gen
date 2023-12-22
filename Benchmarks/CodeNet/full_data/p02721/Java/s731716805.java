import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int c = scan.nextInt();
    String plan = scan.next();
    boolean[] can_work_days = new boolean[n];
    for(int i = 0;i < n;i++){
      if(plan.charAt(i) == 'o'){
        can_work_days[i] = true;
      }else{
        can_work_days[i] = false;
      }
    }
    
    int[] earliest_days = new int[k];
    int[] latest_days = new int[k];
    
    for(int i = 0, work_day = 0;work_day < k;i++){
      if(can_work_days[i]){
        earliest_days[work_day] = i;
        i += c;
        work_day++;
      }
    }
    for(int i = n - 1, work_day = 0;work_day < k;i--){
      if(can_work_days[i]){
        latest_days[work_day] = i;
        i -= c;
        work_day++;
      }
    }
    for(int i = 0;i < k;i++){
      if(earliest_days[i] == latest_days[k - i - 1])System.out.println(earliest_days[i] + 1);
    }
  }
}