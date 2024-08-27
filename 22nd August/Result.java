import studentinfo.Test;
import sports.Sports;

class Result extends Test implements Sports {
    private int score1;
    private int score2;

    public void inputSportsDetails(int score1, int score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    public void showGrandTotal() {
        int totalMarks = mark1 + mark2;
        int totalScore = score1 + score2;
        int grandTotal = totalMarks + totalScore;

        super.showDetails();
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Grand Total: " + grandTotal);
    }

    public static void main(String[] args) {
        Result student = new Result();

        // Input details for student, marks, and sports scores
        student.inputDetails("John Doe", 101, 85, 90);
        student.inputSportsDetails(20, 25);

        // Display the grand total
        student.showGrandTotal();
    }
}