/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gparev;

/**
 *
 * @author Colby
 */
public class GpaRev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        
        //Variables -- Used booleans to track and return to the invalid input
        int toStart = 0;
        int classNum = 1;
        int totalCredits = 0;
        double qualityPoints = 0.0;
        String grade = "";
        String strCheck;
        boolean validAns = true;
        boolean validGrade = true;
        double gpa;
        
        //Credits Block
        while (toStart != -1){
        if(validGrade == true){
        System.out.print("How many credits for class #" + classNum + "? (Enter -1 to stop)");
        strCheck = input.nextLine();
        try{
        toStart = Integer.parseInt(strCheck);
        validAns = true;
        }catch(Exception t){
            System.out.println("" + strCheck + " is not a number. Try Again.");
            validAns = false;
        }
        }
        
        //Grade Block
        if(toStart == -1 && totalCredits == 0){
            System.out.println("User has no meanigful GPA. Exiting program.");
        }else if (toStart != -1 && validAns == true){
        try {
        System.out.print("What grade did you get in class #" + classNum + "?");
        grade = input.nextLine();
        qualityPoints = qualityPoints + (gpaPts(grade)* toStart);
        classNum ++;
        totalCredits += toStart;
        validGrade = true;
        } catch (Exception e) {
            System.out.println("" + grade +  " is not a valid grade. Try Again.");
            validGrade = false;
        }
        }    
        }
        
        // Final Outputs
        gpa = qualityPoints/totalCredits;
        if(totalCredits != 0){
        System.out.println("Your GPA is " + df.format(gpa) +".");
        if(gpa == 4.00 && totalCredits >= 12){
            System.out.println("You made the President's List!");
        } else if(gpa >= 3.50 && totalCredits >= 12){
            System.out.println("You made the Dean's List!");
        } else if(gpa < 2.00){
            System.out.println("You will be placed on academic probation.");
        }
        }
        
        
    }
    
    //GPA Grade-to-num converter
    static double gpaPts (String grade) throws Exception {
        double convgrade;
        if(grade.equals("A")){
            convgrade = 4.00;
        } else if(grade.equals("A-")){
            convgrade = 3.70;
        } else if(grade.equals("B+")){
            convgrade = 3.30;
        } else if(grade.equals("B")){
            convgrade = 3.00;
        } else if(grade.equals("B-")){
            convgrade = 2.70;
        } else if(grade.equals("C+")){
            convgrade = 2.30;
        } else if(grade.equals("C")){
            convgrade = 2.00;
        } else if(grade.equals("C-")){
            convgrade = 1.70;
        } else if(grade.equals("D+")){
            convgrade = 1.30;
        } else if(grade.equals("D")){
            convgrade = 1.00;
        } else if(grade.equals("F")){
            convgrade = 0.00;
        } else{
            throw new Exception();
        }
        return convgrade;
    }
}
