package sdoward.com.sharingmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import sdoward.com.sharingmodule.facebook.FacebookSharer;

public class SharingActivity extends AppCompatActivity {

    @Inject
    FacebookSharer facebookSharer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerSharingComponent.create().inject(this);
        facebookSharer.shareText("Hello facebook");
    }
}
