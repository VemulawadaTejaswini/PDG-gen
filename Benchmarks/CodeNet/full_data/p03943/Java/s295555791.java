class probA{
static public void main(String[] args) 
{
int suji[] = new suji[3];
int i, sum = 0;
for (i = 0; i < 3; i++){
suji[i] = Integer.parseInt(args[i]);
sum  += num[i];
}
 
for (i = 0; i < 3; i++){
if (sum - suji[i] == suji[i]){
System.out.println("Yes");
System.exit(0);
}
}
System.out.println("No");
System.exit(0);
}