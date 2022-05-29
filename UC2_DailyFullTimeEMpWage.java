package day4empoywage;

public class UC2_DailyFullTimeEMpWage {

	public static void main(String[] args) {
		 int fullTimeworker=1;
          int wagePerHr=20;
          int emphr=0;
		int empwage=0;
	double	empCheck = (int) Math.floor(Math.random() * 10) % 2;
			if (empCheck ==fullTimeworker )
				emphr=8;
			empwage=emphr*wagePerHr;
     System.out.println("EMP Wages of FULL TIme Worker  is :"+ empwage);
	}

}
 