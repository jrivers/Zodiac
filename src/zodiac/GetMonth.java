/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zodiac;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class GetMonth {
    private int month;
    public int setMonth()
    {
        Scanner MScan = new Scanner(System.in);
        month = MScan.nextInt();
        while(month<1 || month>12)
        {
            System.out.println("Ummm somethings not right here please input a number between 1 and 12");
                    month = MScan.nextInt();

        }
        return month;
    }

    
}
