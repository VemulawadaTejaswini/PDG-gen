//65
public class func{
	public void assertDatapointValuesDescribeDateStringField(DataPoint<String> datapoint,DateFormat format,String columnName){
    String value = datapoint.getValue();
    assertNotNull("Values should never be null", value);
    assertEquals(columnName, value, format.format(datapoint.getDate()));
}
}
