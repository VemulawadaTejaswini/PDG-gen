public class A{
	private void registerChannel(Selector argSelector,SelectableChannel argSelectableChannel,int argOperations) throws IOException {
		//...
		argSelectableChannel.register(argSelector, argOperations);
	}
}