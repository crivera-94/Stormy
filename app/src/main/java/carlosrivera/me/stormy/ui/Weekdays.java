package carlosrivera.me.stormy.ui;

/**
 * Created by carlo on 1/3/2017.
 */

public enum Weekdays {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public String toString() {
        switch (this) {
            case SUNDAY: return "Sunday";
            case MONDAY: return "Monday";
            case TUESDAY: return "Tuesday";
            case WEDNESDAY: return "Wednesday";
            case THURSDAY: return "Thursday";
            case FRIDAY: return "Friday";
            case SATURDAY: return "Saturday";
        }
        return this.toString();
    }

    public Weekdays getNextDay() {
        switch (this) {
            case SUNDAY: return MONDAY;
            case MONDAY: return TUESDAY;
            case TUESDAY: return WEDNESDAY;
            case WEDNESDAY: return THURSDAY;
            case THURSDAY: return FRIDAY;
            case FRIDAY: return SATURDAY;
            case SATURDAY: return SUNDAY;
        }
        return this.getNextDay();
    }
}
