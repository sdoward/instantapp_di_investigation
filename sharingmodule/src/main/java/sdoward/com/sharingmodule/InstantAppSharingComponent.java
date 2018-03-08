package sdoward.com.sharingmodule;

import dagger.Component;

@Component(modules = InstantSharingModule.class)
public interface InstantAppSharingComponent extends SharingComponent {

    void inject(SharingActivity sharingActivity);

}
