public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner SC = new Scanner(System.in);
int N  = SC.nextInt();
int[] A = new int[N];
int[] freq = new int[100000 + 1];
for (int i = 0; i < N; i++)
{
  A[i] = SC.nextInt();
}
for (int i = 0; i < N; i++)
{
  freq[A[i]] += 1; //case do nothing:
  if (A[i] - 1 >= 0) freq[A[i] - 1] += 1;
  freq[A[i] + 1] += 1;
}
int counter = 0;
for (int i = 0; i< 100000 + 1; i++)
{
  counter = Math.max(counter, freq[i]);
}
System.out.println(counter);
	}

}
