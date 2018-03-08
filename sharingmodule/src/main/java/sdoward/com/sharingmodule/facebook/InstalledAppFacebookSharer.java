package sdoward.com.sharingmodule.facebook;

import android.util.Log;

public class InstalledAppFacebookSharer implements FacebookSharer {

    @Override
    public void shareText(String text) {
        Log.d("sharing", "installed app sharing text on facebook");

    }

    @Override
    public void shareImage(String imageUri) {
        Log.d("sharing", "installed app sharing image on facebook");
    }

}
