//100
public class func{
	public void shouldProvideStringForDate(){
        assertThat(new JcrValue(factories, PropertyType.DATE, date.getTime()).getString().substring(0, expectedValue.length()),
                   is(expectedValue));
}
}
