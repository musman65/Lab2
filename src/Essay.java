/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usman
 */
public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    public void setScore(double gr, double sp, double len, double cnt) {
        super.setScore(gr + sp + len + cnt);
    }
    
    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public void setContent(double content) {
        this.content = content;
    }

    public double getGrammar() {
        return grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    @Override
    public double getScore() {
        return super.getScore();
    }
}
