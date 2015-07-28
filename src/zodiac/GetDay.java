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
import java.util.Scanner;
public class GetDay {
private int day;
public int setday(String month)
        {
            Scanner DScan = new Scanner(System.in);
            day = DScan.nextInt();
            if(month=="January"||month=="March"||month=="May"||month=="July"||month=="August"||month=="October"||month=="December")
            {
                while(day<1||day>31)
                {
                    System.out.println("Wait a minute there are 31 days in "+month+ " please enter a number between 1 and 31");
                    day = DScan.nextInt();
                }
            }
            else if(month=="April"||month=="June"||month=="September"||month=="November")
            {
                while(day<1||day>30)
                {
                    System.out.println("Wait a minute there are 30 days in "+month+ " please enter a number between 1 and 30");
                    day = DScan.nextInt();
                }
            }
            else if(month=="February")
            {
                while(day<1||day>29)
                {
                    System.out.println("Wait a minute there are 28 days in "+month+ " unless you were born in a leap year then there are 29" );
                    System.out.println("please enter a number between 1 and 29");
                    day = DScan.nextInt();
                }
            }
            return day;
            
        }
    
}
