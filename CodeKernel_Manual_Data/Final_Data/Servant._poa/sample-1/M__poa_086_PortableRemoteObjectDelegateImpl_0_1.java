public class A{
	public void connect(Remote a_target, Remote a_source)throws RemoteException{
		ORB orb = null;
		POA poa = null;
		boolean ok = false;
		
		try{
			if (a_source instanceof Servant){
				Servant s = (Servant) a_source;
				orb = s._orb();
				poa = s._poa();
				ok = true;
			}
			
			if (!ok && a_source instanceof ObjectImpl){
				ObjectImpl o = (ObjectImpl) a_source;
				orb = o._orb();
				ok = true;
				try{
					if (orb instanceof ORB_1_4){
						ORB_1_4 xorb = (ORB_1_4) orb;
						Delegate d = o._get_delegate();
						
						if (d instanceof LocalDelegate){
							LocalDelegate l = (LocalDelegate) d;
							poa = l.poa;
						}
						else if (d instanceof SimpleDelegate){
							byte[] ior_key = ((SimpleDelegate) d).getIor().key;
							AOM.Obj ref = xorb.rootPOA.findIorKey(ior_key);
							if (ref != null)poa = ref.poa;
						}
					}
				}
				catch (Exception ex){
				}
			}
		}
		catch (Exception ex){
			RuntimeException rex = new RuntimeException("Unable to get info from "+ a_source);
			rex.initCause(ex);
			throw rex;
		}
		
		if (!ok && a_source instanceof Tie){
			Tie t = (Tie) a_source;
			orb = t.orb();
			poa = null;
			ok = true;
		}
		
		if (orb == null)throw new RemoteException("Unable to determine ORB from " + a_source);

		if (a_target instanceof Stub){
			StubDelegateImpl.connect((Stub) a_target, orb, poa);
		}
		else if (a_target instanceof Servant){
			try{
				if (poa == null){
					poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
					if (poa.the_POAManager().get_state().value() == State._HOLDING)poa.the_POAManager().activate();
				}
				poa.servant_to_reference((Servant) a_target);
			}
			catch (Exception ex){
				throw new Unexpected(ex);
			}
		}
		else if (a_target instanceof org.omg.CORBA.Object){
			orb.connect((org.omg.CORBA.Object) a_target);
		}
		else if (a_target instanceof Tie){
			((Tie) a_target).orb(orb);
		}
	}
}