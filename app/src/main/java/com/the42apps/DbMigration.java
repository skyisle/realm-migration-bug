package com.the42apps;

import android.util.Log;

import io.realm.Realm;
import io.realm.RealmMigration;

/**
 * Created by skyisle on 11/21/15.
 */
public class DbMigration implements RealmMigration {
    private static final String TAG = "DbMigration";

    @Override
    public long execute(Realm realm, long version) {
        Log.d(TAG, "execute with version = " + version);
        return 0;
    }
}
