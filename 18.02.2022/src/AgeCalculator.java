
public class AgeCalculator {

	public static void main(String[] args) {
		
		age(18,2,2022,7,6,1999);
	}
	public static void age(int date,int month,int year,int birthdate,int birthmonth,int birthyear)
	{
		int caldate=0;
		int calmonth=0;
		int calyear=0;
		int months[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(birthdate>date) 
		{
			date=months[date]+date;
			month-=1;
		}
		if(birthmonth>month)
		{
			year -=1;
			month +=12;
		}
		caldate=date-birthdate;
		calmonth=month-birthmonth;
		calyear=year-birthyear;
		System.out.println("you are "+caldate+" days,"+calmonth+" months and "+calyear+" year old");
	}
}
