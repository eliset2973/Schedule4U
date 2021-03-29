package com.example.schedule4u;
import java.io.Serializable;
import java.util.List;
import java.util.LinkedList;

// holds all activity data used on app
public class Activity_S4U_Lists implements java.io.Serializable {
    public List<Activity_S4U> active;
    public List<Activity_S4U> deleted;

    // constructor
    public Activity_S4U_Lists(boolean useSampleActivitiesInsteadOfEmptyList) {
        active = new LinkedList<Activity_S4U>();
        deleted = new LinkedList<Activity_S4U>();
        if (useSampleActivitiesInsteadOfEmptyList) {
            for (Integer i = new Integer(1); i < 3; i++) {
                Activity_S4U temp = new Activity_S4U();
                temp.name = temp.name + " " + i.toString();
                active.add(temp);
            }
        }
    }
}
