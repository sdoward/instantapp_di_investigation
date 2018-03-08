package sdoward.com.sharingmodule.facebook;

import android.util.Log;

public class InstantAppFacebookSharer implements FacebookSharer {

    @Override
    public void shareText(String text) {
        Log.d("sharing", "instant app sharing text on facebook");

    }

    @Override
    public void shareImage(String imageUri) {
        Log.d("sharing", "instant app sharing image on facebook");
    }
}
