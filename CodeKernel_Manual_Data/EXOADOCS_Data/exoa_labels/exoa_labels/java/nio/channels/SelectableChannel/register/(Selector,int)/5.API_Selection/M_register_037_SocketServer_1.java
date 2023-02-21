public class A{
	private void registerChannel(Selector argSelector,SelectableChannel argSelectableChannel,int argOperations) throws IOException {
		if (argSelectableChannel != null && argSelector != null) {
			argSelectableChannel.configureBlocking(false);
			argSelectableChannel.register(argSelector, argOperations);
		}
	}
}