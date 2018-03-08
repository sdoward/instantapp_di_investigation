package sdoward.com.instantappdiinvestigation;


import android.app.Application;

import sdoward.com.sharingmodule.ComponentProvider;
import sdoward.com.sharingmodule.DaggerSharingComponent;
import sdoward.com.sharingmodule.SharingComponent;

public class App extends Application implements ComponentProvider {

    @Override
    public SharingComponent provideSharingComponent() {
        return DaggerSharingComponent.create();
    }

}
