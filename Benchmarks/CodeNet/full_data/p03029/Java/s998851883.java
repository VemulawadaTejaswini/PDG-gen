class TestClass
{
    public static void main(String[] args)
    {
      int apple = Integer.parseInt(args[0]);
      int applePiece = Integer.parseInt(args[1]);
      int applePie = (3*apple+applePiece)/2;
      System.out.println(applePie);
    }
}