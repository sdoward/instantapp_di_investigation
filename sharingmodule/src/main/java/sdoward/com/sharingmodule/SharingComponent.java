package sdoward.com.sharingmodule;

import dagger.Component;

@Component(modules = {InstalledSharingModule.class})
public interface SharingComponent {

    void inject(SharingActivity sharingActivity);

}
