package track.M02.T01.ST01.P01;

public class Homework1 {

    public static void main(String[] args) {
        int completedtopics = 17;
        int totaltopics = 20;
        int dailylearnerhour = 3;
        int learningdays = 5;

        int remainingtopics = totaltopics - completedtopics;
        int weeklylearninghours = dailylearnerhour * learningdays;
        double progresspercentage = (double) completedtopics * 100 / totaltopics;

        System.out.println("Completed Topics: " + completedtopics);
        System.out.println("Remaining Topics: " + remainingtopics);
        System.out.println("Weekly Learning Hours: " + weeklylearninghours);
        System.out.println("Progress Percentage: " + progresspercentage);
    }
}
