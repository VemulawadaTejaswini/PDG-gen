public class A{
	private void loadProperties(InputStream preferences_input_stream) {
		
		try {
			this.loadFromXML(preferences_input_stream);
		} catch (InvalidPropertiesFormatException exc) {
			JOptionPane.showMessageDialog(null,this.invalid_format_string,this.error_string,JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,this.input_output_error_string + ": " +e.getMessage(),this.error_string,JOptionPane.ERROR_MESSAGE);
		}
	}
}