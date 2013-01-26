package birthdaydate;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char response = 'y';
        int month, Day, Year, total, remainder;
        int LeapYear;
        
        Date today = new Date();
        String dayofweek = new String();
        Scanner reader = new Scanner(System.in);

        System.out.println("What month were you born in?");
        month = reader.nextInt(); 

        System.out.println("What day were you born on?");
        Day = reader.nextInt();

        System.out.println("What were the last two digits of the year were you born in?");
        Year = reader.nextInt();

        total = (Year / 4);
        total = (total + Year);
        total = (total + Day);

        switch (month) {
            case 4:
            case 7: {
                total = total + 0;
                break;
            }
            case 1:
            case 10: {
                total = total + 1;
                break;
            }
            case 5: {
                total = total + 2;
                break;
            }
            case 8: {
                total = total + 3;
                break;
            }
            case 2:
            case 3:
            case 11: {
                total = total + 4;
                break;
            }
            case 6: {
                total = total + 5;
                break;
            }
            case 9:
            case 12: {
                total = total + 6;
                break;
            }
        }

            LeapYear = (Year % 4);

            if ((LeapYear == 0) && (month == 1 || month == 2)){
                    total = total - 1;
            }
                remainder = total % 7;
                
                switch(remainder)
                {
                    case 1: {dayofweek = "Sunday"; break;}
                    case 2: {dayofweek = "Monday"; break;}
                    case 3: {dayofweek = "Tuesday"; break;}
                    case 4: {dayofweek = "Wednesday"; break;}
            }
                System.out.println("Your birthday was " + month + "/" + Day + "/" + Year);
                System.out.println("You were born on a " + dayofweek);
                
                System.out.println("Done.");
                System.out.println();
                System.out.println(today);
        }
    
}
