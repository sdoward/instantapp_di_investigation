package sdoward.com.sharingmodule;

import dagger.Module;
import dagger.Provides;
import sdoward.com.sharingmodule.facebook.FacebookSharer;
import sdoward.com.sharingmodule.facebook.InstalledAppFacebookSharer;
import sdoward.com.sharingmodule.twitter.InstalledAppTwitterSharer;
import sdoward.com.sharingmodule.twitter.TwitterSharer;

@Module
public class InstalledSharingModule {

    @Provides
    static FacebookSharer provideFacebookSharer() {
        return new InstalledAppFacebookSharer();
    }

    @Provides
    static TwitterSharer provideTwitterSharer() {
        return new InstalledAppTwitterSharer();
    }

}
