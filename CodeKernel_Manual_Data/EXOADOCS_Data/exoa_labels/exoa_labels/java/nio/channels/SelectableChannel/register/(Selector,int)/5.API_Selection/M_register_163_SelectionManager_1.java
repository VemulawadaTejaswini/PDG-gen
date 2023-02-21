public class A{
	private void processRenewQueue() {
		assert Thread.holdsLock(lock);
		assert selectingThread != null;
		
		while (!isRenewQueueEmpty()) {
			Key key = removeFromRenewQueue(renewMaskRef);
			int renewMask = renewMaskRef[0];
			assert renewMask != 0;
			
			if (key.selectionKey == null) {
				assert key.interestMask == 0 && key.readyMask == 0;
				
				try {
					key.selectionKey = key.channel.register(selector,renewMask);
					key.selectionKey.attach(key);
					key.interestMask = renewMask;
				} catch (ClosedChannelException e) {
					addOrUpdateReadyQueue(key, renewMask);
				} catch (IllegalBlockingModeException e) {
					addOrUpdateReadyQueue(key, renewMask);
				}
			} else {
				assert (key.interestMask & renewMask) == 0;
				
				int newInterestMask = key.interestMask | renewMask;
				try {
					assert key.interestMask == key.selectionKey.interestOps();
					key.selectionKey.interestOps(newInterestMask);
					key.interestMask = newInterestMask;
				} catch (CancelledKeyException e) {
					addOrUpdateReadyQueue(key, newInterestMask);
					key.interestMask = 0;
				}
				
				assert (key.interestMask & key.readyMask) == 0;
			}
		}
	}
}