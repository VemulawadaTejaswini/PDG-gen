class Solution{
public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   // Codes for input goes here
  int A = scn.nextInt();
  int B = scn.nextInt();
  scn.close();
  B = 2 * B;
  int diff = B-A;
  if(diff>0)
    return diff;
  return 0;
   
}

}