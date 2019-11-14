using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace XF_FacebookAds
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
            AddFacebookAdsControl();
        }

        private void AddFacebookAdsControl()
        {
            FacebookAdsControl fbAdsControl = new FacebookAdsControl();

            fbAdsControl.HeightRequest = 50;

            fbAdsControl.PlacementId = "ID Here"; //We create this on developer facebook website

            fbAdsControl.Size = FacebookAdsControl.FacebookAdSize.Banner32050;

            fbAdsControl.VerticalOptions = LayoutOptions.EndAndExpand;

            StackLayoutAds.Children.Add(fbAdsControl);
        }
    }
}
