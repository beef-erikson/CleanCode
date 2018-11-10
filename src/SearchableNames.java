/*
 *  Use names that are easily searchable
 */
public class SearchableNames {

    // Consider the difference between these two.

    private void horrible() {
        for (int i=0; i<34; i++) {
        s += (t[j]) * 4 / 5;
        }
    }

    private void muchBetter() {
        int realDaysPerIdealDay = 4;
        final int WORK_DAYS_PER_WEEK = 5;
        int sum = 0;
        for (int i=0; i < NUMBER_OF_TASKS; i++) {
            int realTaskDays = taskEstimate[i] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
    }

}
