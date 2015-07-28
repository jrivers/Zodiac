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
public class Zodiac {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        Scanner JScan = new Scanner(System.in);
        int birthmonth,birthDay;
        String monthWord,sign;
        GetMonth enteredMonth = new GetMonth();
        NameOfMonth monthName = new NameOfMonth();
        GetDay enteredDay = new GetDay();
        ZodiacCalculator getSign = new ZodiacCalculator();
        System.out.println("Welcome to the Zodiac Sign Calculator");
        System.out.println("What is your first name");
        name = JScan.nextLine();
        System.out.println("Hi " + name + " I can tell you what your zodiac sign is");
        System.out.println("So lets start by getting your birthday");
        System.out.println("Give me the month you were born in please input a number between 1 and 12 for the month");
        birthmonth = enteredMonth.setMonth();
        monthWord = monthName.getmonthname(birthmonth);
        System.out.println("So you were born in "+ monthWord);
        System.out.println("Now what day in "+ monthWord +" were you born");
        birthDay = enteredDay.setday(monthWord);
        sign = getSign.calculatesign(birthmonth, birthDay);
        if (sign=="Aries"||sign=="Aquarius"){
        System.out.println(monthWord+" "+birthDay+" ha that's a easy one you are an "+sign);
        }
        else
        {
            System.out.println(monthWord+" "+birthDay+" ha that's a easy one you are a "+sign);
        }
        
        
        
    }
    
}
