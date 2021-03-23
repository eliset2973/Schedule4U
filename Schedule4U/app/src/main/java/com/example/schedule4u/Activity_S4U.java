import java.util.Date;
public class Activity_S4U {
    // used Create Task page for reference
    public String name;
    public int time_alotted; // minutes
    public Date complete_task_by;
    public int importance;
    public Date  start_time;
    public Date end_time;
    public String details;
    public int splitTask;

    // for now we just have a 0 argument constructor filled with dummy values
    public Activity_S4U() {
        this.name = "Name placeholder";
        this.time_alotted = 60;
        this.complete_task_by = new Date(System.currentTimeMillis()+1000*60*60*24*7);
        this.importance = 2;
        this.start_time = new Date(System.currentTimeMillis()+1000*60*60*24*6);
        this.end_time = new Date(System.currentTimeMillis()+1000*60*60*24*7);
        this.details = "Details placeholder";
        this.splitTask = 1;
    }

    /*public static void main(String[] args) {
        Activity_S4U test_activity = new Activity_S4U();
        System.out.println(test_activity.time_alotted);
    }*/
}