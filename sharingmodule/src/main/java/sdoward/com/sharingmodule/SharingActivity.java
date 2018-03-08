package sdoward.com.sharingmodule;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import sdoward.com.sharingmodule.facebook.FacebookSharer;
import sdoward.com.sharingmodule.twitter.TwitterSharer;

public class SharingActivity extends Activity {

    @Inject
    FacebookSharer facebookSharer;

    @Inject
    TwitterSharer twitterSharer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ComponentProvider componentProvider = (ComponentProvider) getApplication();
        componentProvider.provideSharingComponent().inject(this);
        facebookSharer.shareText("Hello facebook");
        twitterSharer.shareImage("image:selfie");
    }
    
}
