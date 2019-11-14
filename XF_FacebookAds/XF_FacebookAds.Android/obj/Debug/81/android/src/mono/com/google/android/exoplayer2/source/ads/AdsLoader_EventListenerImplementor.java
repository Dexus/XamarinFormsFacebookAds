package mono.com.google.android.exoplayer2.source.ads;


public class AdsLoader_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClicked:()V:GetOnAdClickedHandler:Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onAdLoadError:(Ljava/io/IOException;)V:GetOnAdLoadError_Ljava_io_IOException_Handler:Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onAdPlaybackState:(Lcom/google/android/exoplayer2/source/ads/AdPlaybackState;)V:GetOnAdPlaybackState_Lcom_google_android_exoplayer2_source_ads_AdPlaybackState_Handler:Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onAdTapped:()V:GetOnAdTappedHandler:Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListenerInvoker, ExoPlayer.Core\n" +
			"n_onInternalAdLoadError:(Ljava/lang/RuntimeException;)V:GetOnInternalAdLoadError_Ljava_lang_RuntimeException_Handler:Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListenerImplementor, ExoPlayer.Core", AdsLoader_EventListenerImplementor.class, __md_methods);
	}


	public AdsLoader_EventListenerImplementor ()
	{
		super ();
		if (getClass () == AdsLoader_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Source.Ads.IAdsLoaderEventListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onAdClicked ()
	{
		n_onAdClicked ();
	}

	private native void n_onAdClicked ();


	public void onAdLoadError (java.io.IOException p0)
	{
		n_onAdLoadError (p0);
	}

	private native void n_onAdLoadError (java.io.IOException p0);


	public void onAdPlaybackState (com.google.android.exoplayer2.source.ads.AdPlaybackState p0)
	{
		n_onAdPlaybackState (p0);
	}

	private native void n_onAdPlaybackState (com.google.android.exoplayer2.source.ads.AdPlaybackState p0);


	public void onAdTapped ()
	{
		n_onAdTapped ();
	}

	private native void n_onAdTapped ();


	public void onInternalAdLoadError (java.lang.RuntimeException p0)
	{
		n_onInternalAdLoadError (p0);
	}

	private native void n_onInternalAdLoadError (java.lang.RuntimeException p0);

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
