package sdoward.com.sharingmodule.twitter;

import android.util.Log;

public class InstantAppTwitterSharer implements TwitterSharer {

    @Override
    public void shareText(String text) {
        Log.d("sharing", "instant app sharing text on twitter");

    }

    @Override
    public void shareImage(String imageUri) {
        Log.d("sharing", "instant app sharing image on twitter");
    }

}
