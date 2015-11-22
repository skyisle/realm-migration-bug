package com.the42apps.realmmigration;

import android.util.Log;

import com.the42apps.realmmigration.model.APersonWithLongClass2;
import com.the42apps.realmmigration.model.BPerson;
import com.the42apps.realmmigration.model.CPerson2;
import com.the42apps.realmmigration.model.DPersonWithLongClass1;

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

        if (BuildConfig.FLAVOR.equals("afterSetPrimaryKeyAgain")) {
            // set primary key again to prevent crash
            Log.d(TAG, "set primary key again to prevent crash");
            realm.getTable(APersonWithLongClass2.class)
                    .setPrimaryKey("userId");
            realm.getTable(BPerson.class)
                    .setPrimaryKey("userId");
            realm.getTable(CPerson2.class)
                    .setPrimaryKey("userId");
            realm.getTable(DPersonWithLongClass1.class)
                    .setPrimaryKey("userId");
        }
        return 0;
    }
}
