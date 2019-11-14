package mono.com.facebook.ads;


public class AudienceNetworkAds_InitListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.facebook.ads.AudienceNetworkAds.InitListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInitialized:(Lcom/facebook/ads/AudienceNetworkAds$InitResult;)V:GetOnInitialized_Lcom_facebook_ads_AudienceNetworkAds_InitResult_Handler:Xamarin.Facebook.Ads.AudienceNetworkAds/IInitListenerInvoker, Xamarin.Facebook.AudienceNetwork.Android\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Facebook.Ads.AudienceNetworkAds+IInitListenerImplementor, Xamarin.Facebook.AudienceNetwork.Android", AudienceNetworkAds_InitListenerImplementor.class, __md_methods);
	}


	public AudienceNetworkAds_InitListenerImplementor ()
	{
		super ();
		if (getClass () == AudienceNetworkAds_InitListenerImplementor.class)
			mono.android.TypeManager.Activate ("Xamarin.Facebook.Ads.AudienceNetworkAds+IInitListenerImplementor, Xamarin.Facebook.AudienceNetwork.Android", "", this, new java.lang.Object[] {  });
	}


	public void onInitialized (com.facebook.ads.AudienceNetworkAds.InitResult p0)
	{
		n_onInitialized (p0);
	}

	private native void n_onInitialized (com.facebook.ads.AudienceNetworkAds.InitResult p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
