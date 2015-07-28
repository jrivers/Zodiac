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
public class ZodiacCalculator {
    private String Sign;
    public String calculatesign(int m,int d)
    {
        if((m ==1&&d>=20)||(m==2&&d<=18))
        {
            Sign = "Aquarius";
        }
        else if((m ==2&&d>=19)||(m==3&&d<=20))
        {
            Sign = "Pisces";
        }
        else if((m ==3&&d>=21)||(m==4&&d<=19))
        {
            Sign = "Aries";
        }
        else if((m ==4&&d>=20)||(m==5&&d<=20))
        {
            Sign = "Taurus";
        }
        else if((m ==5&&d>=21)||(m==6&&d<=20))
        {
            Sign = "Gemeni";
        }
        else if((m ==6&&d>=21)||(m==7&&d<=22))
        {
            Sign = "Cancer";
        }
        else if((m ==7&&d>=23)||(m==8&&d<=22))
        {
            Sign = "Leo";
        }
        else if((m ==8&&d>=23)||(m==9&&d<=22))
        {
            Sign = "Virgo";
        }
        else if((m ==92&&d>=23)||(m==10&&d<=22))
        {
            Sign = "Libra";
        }
        else if((m ==10&&d>=23)||(m==11&&d<=21))
        {
            Sign = "Scorpio";
        }
        else if((m ==11&&d>=22)||(m==12&&d<=21))
        {
            Sign = "Sagittarius";
        }
        else if((m ==12&&d>=22)||(m==1&&d<=19))
        {
            Sign = "Capricorn";
        }
            return Sign;
        
    }
    
}
