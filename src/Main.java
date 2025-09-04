
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usman
 */
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many questions are on the final exam?");
        int questions = in.nextInt();
        System.out.println("How many questions did the student miss?");
        int missed = in.nextInt();
        
        FinalExam fe = new FinalExam(questions, missed);
        System.out.println("Each question counts for " + fe.getPointsEach());
        System.out.println("The exam score is " + fe.getScore());
        System.out.println("The exam grade is " + fe.getGrade());
        
    }
}
