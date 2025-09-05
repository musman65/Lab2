/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usman
 */
public class CourseGrades {
    private GradedActivity grades[] = new GradedActivity[4];
    
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    @Override
    public String toString() {
        return "Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade() + "\n" +
                "Pass/Fail Exam Score: " + grades[1] + "\tGrade: " + grades[1].getGrade() + "\n" + 
                "Essay Score: " + grades[2] + "\tGrade: " + grades[2].getGrade() + "\n" + 
                "Final Exam Score: " + grades[3] + "\tGrade: " + grades[3].getGrade() + "\n";  
    }
    
}
