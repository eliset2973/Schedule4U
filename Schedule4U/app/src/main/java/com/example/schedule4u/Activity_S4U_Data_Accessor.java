package com.example.schedule4u;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import android.content.Context;

public class Activity_S4U_Data_Accessor {
    // lists is an object that contains all of our S4U Activities
    public Activity_S4U_Lists lists;
    public boolean usedSavedData;
    public Context context;
    public String filename;

    public Activity_S4U_Data_Accessor(boolean useSavedData) {
        usedSavedData = useSavedData;
        S4UApplication S4U_App = new S4UApplication();
        context = S4U_App.getApplicationContext();
        filename = "Activity_S4U_Data_Binary";
        if (usedSavedData) {
            usedSavedData = this.load();
        }
        // use example data
        if (!usedSavedData) {
            lists = new Activity_S4U_Lists(true);
        }
    }

    // false for fail, true for succede
    public boolean load() {
        S4UApplication S4U_App = new S4UApplication();
        context = S4U_App.getApplicationContext();
        Activity_S4U_Lists asl = null;
        try {
            //File file = new File(Context.getFilesDir(), "Activity_S4U_Data_Binary");
            // BufferedReader br = null;
            // new InputStreamReader(context.openFileInput(filename));
            FileInputStream fis = context.openFileInput(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            asl = (Activity_S4U_Lists) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return false;
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            return false;
        }
        lists = asl;
        return true;
    }

    public boolean save() {
        S4UApplication S4U_App = new S4UApplication();
        context = S4U_App.getApplicationContext();
        try (FileOutputStream fos = context.openFileOutput(filename, Context.MODE_PRIVATE)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lists);
            oos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return false;
        }
        return true;
    }
}
