//64
public class func{
public void assertDatapointValuesDescribeDateIntegerField(DataPoint<Integer> datapoint,DateFormat format,String columnName){
    Integer value = datapoint.getValue();
    assertNotNull("Values should never be null", value);
    assertEquals(columnName + " of " + datapoint, (int) value, Integer.parseInt(format.format(datapoint.getDate())));
}
}
