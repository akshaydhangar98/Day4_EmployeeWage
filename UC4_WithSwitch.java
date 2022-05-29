package day4empoywage;

public class UC4_WithSwitch {

	
			 final static int fullTimeworker=1;
				final static int PartTimeworker=2;
			public static void main(String[] args) {
				 
			     int wagePerHr=20;
			     int emphr=0;
					int empwage=0;
					double empCheck =  Math.floor(Math.random() * 10) % 3;
				     switch ((int)empCheck) 
				   {
					
					case  fullTimeworker:
						emphr=8;
					break;
					
					case PartTimeworker:
					emphr=4;
					break;
					default:
						emphr=0;
				} 
						empwage=emphr*wagePerHr;
			System.out.println("EMP Wages  is :"+ empwage);

			

		}

	}


