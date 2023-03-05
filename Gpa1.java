/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpa1;

/**
 *
 * @author Colby
 */
public class Gpa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.setMaximumFractionDigits(3);
        
        //Variables Start
        int credit1, credit2, credit3, credit4, credit5;
        String grade1, grade2, grade3, grade4, grade5;
        double convgrade1 = 0, convgrade2 = 0, convgrade3 = 0, convgrade4 = 0, 
                convgrade5 = 0;
        int totalCredits;
        double qualityPoints;
        double thegpa;
        
        
        
        //I/O
        System.out.print("How many credits was your first class?");
        credit1 = Integer.parseInt(input.nextLine());
        System.out.print("What grade did you get?");
        grade1 = input.nextLine();
        System.out.print("How many credits was your second class?");
        credit2 = Integer.parseInt(input.nextLine());
        System.out.print("What grade did you get?");
        grade2 = input.nextLine();
        System.out.print("How many credits was your third class?");
        credit3 = Integer.parseInt(input.nextLine());
        System.out.print("What grade did you get?");
        grade3 = input.nextLine();
        System.out.print("How many credits was your fourth class?");
        credit4 = Integer.parseInt(input.nextLine());
        System.out.print("What grade did you get?");
        grade4 = input.nextLine();
        System.out.print("How many credits was your fifth class?");
        credit5 = Integer.parseInt(input.nextLine());
        System.out.print("What grade did you get?");
        grade5 = input.nextLine();
        
        
        //Grade Conversion Table (Grade 1 Conversion) 
        if(grade1.equals("A")){
            convgrade1 = 4.00;
        } else if(grade1.equals("A-")){
            convgrade1 = 3.70;
        } else if(grade1.equals("B+")){
            convgrade1 = 3.30;
        } else if(grade1.equals("B")){
            convgrade1 = 3.00;
        } else if(grade1.equals("B-")){
            convgrade1 = 2.70;
        } else if(grade1.equals("C+")){
            convgrade1 = 2.30;
        } else if(grade1.equals("C")){
            convgrade1 = 2.00;
        } else if(grade1.equals("C-")){
            convgrade1 = 1.70;
        } else if(grade1.equals("D+")){
            convgrade1 = 1.30;
        } else if(grade1.equals("D")){
            convgrade1 = 1.00;
        } else if(grade1.equals("F")){
            convgrade1 = 0.00;
        }
        
        //Grade 2 Conversion
        if(grade2.equals("A")){
            convgrade2 = 4.00;
        } else if(grade2.equals("A-")){
            convgrade2 = 3.70;
        } else if(grade2.equals("B+")){
            convgrade2 = 3.30;
        } else if(grade2.equals("B")){
            convgrade2 = 3.00;
        } else if(grade2.equals("B-")){
            convgrade2 = 2.70;
        } else if(grade2.equals("C+")){
            convgrade2 = 2.30;
        } else if(grade2.equals("C")){
            convgrade2 = 2.00;
        } else if(grade2.equals("C-")){
            convgrade2 = 1.70;
        } else if(grade2.equals("D+")){
            convgrade2 = 1.30;
        } else if(grade2.equals("D")){
            convgrade2 = 1.00;
        } else if(grade2.equals("F")){
            convgrade2 = 0.00;
        }
        
        //Grade 3 Conversion
        if(grade3.equals("A")){
            convgrade3 = 4.00;
        } else if(grade3.equals("A-")){
            convgrade3 = 3.70;
        } else if(grade3.equals("B+")){
            convgrade3 = 3.30;
        } else if(grade3.equals("B")){
            convgrade3 = 3.00;
        } else if(grade3.equals("B-")){
            convgrade3 = 2.70;
        } else if(grade3.equals("C+")){
            convgrade3 = 2.30;
        } else if(grade3.equals("C")){
            convgrade3 = 2.00;
        } else if(grade3.equals("C-")){
            convgrade3 = 1.70;
        } else if(grade3.equals("D+")){
            convgrade3 = 1.30;
        } else if(grade3.equals("D")){
            convgrade3 = 1.00;
        } else if(grade3.equals("F")){
            convgrade3 = 0.00;
        }
        
        //Grade 4 Conversion
        if(grade4.equals("A")){
            convgrade4 = 4.00;
        } else if(grade4.equals("A-")){
            convgrade4 = 3.70;
        } else if(grade4.equals("B+")){
            convgrade4 = 3.30;
        } else if(grade4.equals("B")){
            convgrade4 = 3.00;
        } else if(grade4.equals("B-")){
            convgrade4 = 2.70;
        } else if(grade4.equals("C+")){
            convgrade4 = 2.30;
        } else if(grade4.equals("C")){
            convgrade4 = 2.00;
        } else if(grade4.equals("C-")){
            convgrade4 = 1.70;
        } else if(grade4.equals("D+")){
            convgrade4 = 1.30;
        } else if(grade4.equals("D")){
            convgrade4 = 1.00;
        } else if(grade4.equals("F")){
            convgrade4 = 0.00;
        }
        
        //Grade 5 Conversion
        if(grade5.equals("A")){
            convgrade5 = 4.00;
        } else if(grade5.equals("A-")){
            convgrade5 = 3.70;
        } else if(grade5.equals("B+")){
            convgrade5 = 3.30;
        } else if(grade5.equals("B")){
            convgrade5 = 3.00;
        } else if(grade5.equals("B-")){
            convgrade5 = 2.70;
        } else if(grade5.equals("C+")){
            convgrade5 = 2.30;
        } else if(grade5.equals("C")){
            convgrade5 = 2.00;
        } else if(grade5.equals("C-")){
            convgrade5 = 1.70;
        } else if(grade5.equals("D+")){
            convgrade5 = 1.30;
        } else if(grade5.equals("D")){
            convgrade5 = 1.00;
        } else if(grade5.equals("F")){
            convgrade5 = 0.00;
        }
        
        //Computations 
        totalCredits = credit1 + credit2 + credit3 + credit4 + credit5;
        qualityPoints = (convgrade1*credit1) + (convgrade2*credit2) +
                (convgrade3*credit3) + (convgrade4*credit4) + (convgrade5*credit5);
        thegpa = qualityPoints/totalCredits;
        
        
         //Final Print Statement
         
        System.out.println(totalCredits);
        System.out.println(qualityPoints);
        System.out.println(thegpa);
        //Special Messages
        
        if(thegpa == 4.0){
            System.out.println("You made the President's List!");
        } else if(thegpa >= 3.5){
            System.out.println("You made the Dean's List!");
        } else if(thegpa < 2.0){
            System.out.println("You will be placed on academic probation.");
        }
        
      
     
            
    
    }
    
}
