public class func{
public void testTransactionalMultibatch(){
    assertTrue(s.execute("select tables.name from tables, columns limit 1025"));
    while (s.getResultSet().next()) {
      count++;
    }
}
}
