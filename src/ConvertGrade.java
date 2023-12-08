public class ConvertGrade {

    public static void main(String[] args) {
        int numericGrade;
        char letterGrade;

        numericGrade = 95;

        if(numericGrade >= 90)
            letterGrade = 'A';
        else if(numericGrade >= 80)
            letterGrade = 'B';
        else if(numericGrade >= 70)
            letterGrade = 'C';
        else if(numericGrade >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';

        System.out.println("Your grade is: " + letterGrade);
    }
}
