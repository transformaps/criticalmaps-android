package de.stephanlindauer.criticalmaps;

import android.content.SharedPreferences;

import com.squareup.picasso.Picasso;
import dagger.Component;
import de.stephanlindauer.criticalmaps.fragments.ChatFragment;
import de.stephanlindauer.criticalmaps.fragments.MapFragment;
import de.stephanlindauer.criticalmaps.handler.PrerequisitesChecker;
import de.stephanlindauer.criticalmaps.model.OwnLocationModel;
import de.stephanlindauer.criticalmaps.model.TwitterModel;
import de.stephanlindauer.criticalmaps.service.ServerSyncService;
import javax.inject.Singleton;
import okhttp3.OkHttpClient;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(Main main);

    void inject(ServerSyncService serverSyncService);

    void inject(MapFragment serverSyncService);

    void inject(ChatFragment chatFragment);

    void inject(PrerequisitesChecker prerequisitesChecker);

    App app();

    Picasso picasso();

    OwnLocationModel ownLocationmodel();

    TwitterModel twitterModel();

    OkHttpClient okHttpClient();

    SharedPreferences sharedPreferences();
}
