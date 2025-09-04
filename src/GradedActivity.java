/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usman
 */
public class GradedActivity {
    private double score;
    
    public void setScore(double s) {
        score = s;
    }
    
    public double getScore(){
        return score;
    }
    
    public char getGrade() {
        char grade;
        
        if (score >= 90) {
            grade = 'A';
        }else if (score >= 80) {
            grade = 'B';
        }else if (score >= 70) {
            grade = 'C';
        }else if (score >= 60) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        
        return grade;
    }
}
