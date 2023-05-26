public class func{
public void dateTest(){
    InputResult result = inputEngine.parseInput(editText, "", inputParseContext);
    Assert.assertEquals(CellType.NUMBER,result.getType());
    Assert.assertTrue(result.getValue() instanceof Date);
    Assert.assertEquals(editText, format.format(result.getValue()));
}
}
