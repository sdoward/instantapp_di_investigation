package sdoward.com.sharingmodule;

import android.app.Application;

public class SharingApplication extends Application implements ComponentProvider {

    @Override
    public SharingComponent provideSharingComponent() {
        return DaggerInstantAppSharingComponent.create();
    }

}
