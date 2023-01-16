//66
public class func{
	public void postServiceDeliveryActions(SituationExchangeResults results,Collection<String> deletedIds){
    for (ServiceAlertSubscription subscription : getActiveServiceAlertSubscriptions()) {
      new Thread(new SubscriptionSender(subscription, deletedIds)).start();
    }
}
}
