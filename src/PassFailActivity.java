/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usman
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;
    
    public PassFailActivity(double mps) {
        minPassingScore = mps;
    }

    @Override
    public char getGrade() {
        return getScore()>= minPassingScore ? 'P' : 'F';
    }
}
