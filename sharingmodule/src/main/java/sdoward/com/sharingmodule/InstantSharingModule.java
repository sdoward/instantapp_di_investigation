package sdoward.com.sharingmodule;

import dagger.Module;
import dagger.Provides;
import sdoward.com.sharingmodule.facebook.FacebookSharer;
import sdoward.com.sharingmodule.facebook.InstantAppFacebookSharer;
import sdoward.com.sharingmodule.twitter.InstantAppTwitterSharer;
import sdoward.com.sharingmodule.twitter.TwitterSharer;

@Module
public class InstantSharingModule {

    @Provides
    static FacebookSharer provideFacebookSharer() {
        return new InstantAppFacebookSharer();
    }

    @Provides
    static TwitterSharer provideTwitterSharer() {
        return new InstantAppTwitterSharer();
    }

}
