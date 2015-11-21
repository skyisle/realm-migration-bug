package com.the42apps.realmmigration;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.the42apps.DbMigration;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by skyisle on 11/21/15.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        RealmConfiguration config = new RealmConfiguration.Builder(this)
                .name("lev.realm")
                .migration(new DbMigration())
                .schemaVersion(0)
                .build();

//        Realm.deleteRealm(config);
        Realm.setDefaultConfiguration(config);

        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this)
                                .withMetaTables()
                                .withDescendingOrder()
                                .withLimit(1000)
                                .build())
                        .build());

    }
}
