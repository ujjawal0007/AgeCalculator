import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Declare variable for age calculation
        int bornYear, currentYear, ageInYear;

        //Get the born year from user as input
        bornYear = Integer.parseInt(JOptionPane.showInputDialog("Enter your born year"));
        //System.out.println(bornYear);

        //To get the current year from the calendar
        GregorianCalendar calendar = new GregorianCalendar();
        currentYear = calendar.get(GregorianCalendar.YEAR);

        //To find the age in year
        ageInYear = currentYear - bornYear;

        //To show the age in dialog
        JOptionPane.showMessageDialog(null,"Your age is " + ageInYear);

    }
}