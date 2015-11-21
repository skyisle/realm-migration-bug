package com.the42apps.realmmigration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.the42apps.realmmigration.model.Person;

import java.util.ArrayList;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm realm = Realm.getDefaultInstance();
        ArrayList<Person> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setUserId(String.valueOf(i));
            person.setUserName("Alan Jeon " + i);
            person.setBirthYear(1980);
            person.setGender("male");
            list.add(person);
        }

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(list);
        realm.commitTransaction();
        realm.close();
    }
}
