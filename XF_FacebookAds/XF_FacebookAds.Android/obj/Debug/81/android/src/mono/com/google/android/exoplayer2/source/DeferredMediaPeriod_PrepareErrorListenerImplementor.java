package mono.com.google.android.exoplayer2.source;


public class DeferredMediaPeriod_PrepareErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.source.DeferredMediaPeriod.PrepareErrorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrepareError:(Ljava/io/IOException;)V:GetOnPrepareError_Ljava_io_IOException_Handler:Com.Google.Android.Exoplayer2.Source.DeferredMediaPeriod/IPrepareErrorListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Source.DeferredMediaPeriod+IPrepareErrorListenerImplementor, ExoPlayer.Core", DeferredMediaPeriod_PrepareErrorListenerImplementor.class, __md_methods);
	}


	public DeferredMediaPeriod_PrepareErrorListenerImplementor ()
	{
		super ();
		if (getClass () == DeferredMediaPeriod_PrepareErrorListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Source.DeferredMediaPeriod+IPrepareErrorListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onPrepareError (java.io.IOException p0)
	{
		n_onPrepareError (p0);
	}

	private native void n_onPrepareError (java.io.IOException p0);

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
