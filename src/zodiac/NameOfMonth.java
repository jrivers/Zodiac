/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zodiac;

/**
 *
 * @author user
 */
public class NameOfMonth {
    private String MonthName;
    
    public String getmonthname(int num)
    {
        switch (num)
        {
            case 1:
                MonthName = "January";
                break;
            case 2:
                MonthName = "February";
                break;
            case 3:
                MonthName = "March";
                break;
            case 4:
                MonthName = "April";
                break;
            case 5:
                MonthName = "May";
                break;
            case 6:
                MonthName = "June";
                break;
            case 7:
                MonthName = "July";
                break;
            case 8:
                MonthName = "August";
                break;
            case 9:
                MonthName = "September";
                break;
            case 10:
                MonthName = "October";
                break;
            case 11:
                MonthName = "November";
                break;
            case 12:
                MonthName = "December";
                break;
            default:
                System.out.println("What month is that?");
                break;
                  
              
                
        }
        return MonthName;
    }
    
}
