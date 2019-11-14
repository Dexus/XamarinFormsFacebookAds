package mono.com.google.android.exoplayer2.offline;


public class Downloader_ProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.offline.Downloader.ProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDownloadProgress:(Lcom/google/android/exoplayer2/offline/Downloader;FJ)V:GetOnDownloadProgress_Lcom_google_android_exoplayer2_offline_Downloader_FJHandler:Com.Google.Android.Exoplayer2.Offline.IDownloaderProgressListenerInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.Offline.IDownloaderProgressListenerImplementor, ExoPlayer.Core", Downloader_ProgressListenerImplementor.class, __md_methods);
	}


	public Downloader_ProgressListenerImplementor ()
	{
		super ();
		if (getClass () == Downloader_ProgressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.Offline.IDownloaderProgressListenerImplementor, ExoPlayer.Core", "", this, new java.lang.Object[] {  });
	}


	public void onDownloadProgress (com.google.android.exoplayer2.offline.Downloader p0, float p1, long p2)
	{
		n_onDownloadProgress (p0, p1, p2);
	}

	private native void n_onDownloadProgress (com.google.android.exoplayer2.offline.Downloader p0, float p1, long p2);

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
