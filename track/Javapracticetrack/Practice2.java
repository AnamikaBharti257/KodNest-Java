package track.Javapracticetrack;

public class Practice2 {

    public static void main(String[] args) {

        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        double reportval = solvedProblems;
        int wholeper = (int) exactPercentage;
        double avgpro = reportval / practiceDays;
        boolean dailytargetreached = false;

        if (avgpro >= 9.0) {
            dailytargetreached = true;
        }

        System.out.println("Report Value: " + reportval);
        System.out.println("Whole Percentage: " + wholeper);
        System.out.println("Average Per Day: " + avgpro);
        System.out.println("Daily Target Reached: " + dailytargetreached);
    }
}
