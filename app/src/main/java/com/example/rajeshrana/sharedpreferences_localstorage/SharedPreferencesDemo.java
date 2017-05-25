package com.example.rajeshrana.sharedpreferences_localstorage;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by rajesh.rana on 25-05-2017.
 */

public class SharedPreferencesDemo {

    SharedPreferences sharedPreferences;

    public SharedPreferencesDemo(Context context) {
        sharedPreferences = context.getSharedPreferences("myFile" , Context.MODE_PRIVATE);
    }

    public void saveData(String fName , String lName){

        SharedPreferences.Editor editor =  sharedPreferences.edit();
        editor.putString("firstName" , fName);
        editor.putString("lastName" , lName);
        editor.commit();
    }



    public String loadData(){

        String fName = sharedPreferences.getString("firstName" , "No First Name");
        String lName = sharedPreferences.getString("lastName" , "No Last name");

        return fName + " and "+lName;
    }
}
