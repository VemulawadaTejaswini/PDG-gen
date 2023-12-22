String out;
try (Scanner scan = new Scanner(System.in)) {
  String input1 = scan.nextLine();
  String input2 = scan.nextLine();
  int num = Integer.valueOf(input1);
  if (num >= 3200) out = input2;
  else out = "red";
} catch (Exception e) {
}
System.out.println(out);