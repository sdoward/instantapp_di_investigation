package sdoward.com.sharingmodule.twitter;

import android.util.Log;

public class InstalledAppTwitterSharer implements TwitterSharer {

    @Override
    public void shareText(String text) {
        Log.d("sharing", "installed app sharing text on twitter");

    }

    @Override
    public void shareImage(String imageUri) {
        Log.d("sharing", "installed app sharing image on twitter");
    }

}
