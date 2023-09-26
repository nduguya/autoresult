package autoresult;
import java.util.Scanner;
public class Autoresult {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int score1,score2,score3,score4;
		String unitcode1,unitcode2,unitcode3,unitcode4;
		System.out.print("Enter Unit Code for Unit 1: ");
		unitcode1= input.nextLine();
		System.out.print("Enter Unit Code for Unit 2: ");
		unitcode2= input.nextLine();
		System.out.print("Enter Unit Code for Unit 3: ");
		unitcode3= input.nextLine();
		System.out.print("Enter Unit Code for Unit 4: ");
		unitcode4= input.nextLine();
		System.out.print("Enter Score for Unit 1: ");
		score1= input.nextInt();
		System.out.print("Enter Score for Unit 2: ");
		score2= input.nextInt();
		System.out.print("Enter Score for Unit 3: ");
		score3= input.nextInt();
		System.out.print("Enter Score for Unit 4: ");
		score4= input.nextInt();
		int sum = score1+score2+score3+score4;
		double avg= (double) sum/4;
		char grade='D';
		if((avg<=100)&&(avg>=70)) {
			grade='A';
		}else if ((avg<70)&&(avg>=60)) {
			grade='B';
		}else if ((avg<60)&&(avg>=50)) {
			grade='C';
		}else if ((avg<50)&&(avg>=40)) {
			grade='D';
		}else if (avg<40) {
			grade='F';
		}
		System.out.println("                                      Department of Computer Science");
		System.out.println("                                           End Semester Results");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Name:Collins Waweru                |Roll_No:C026-01-0903/2022                Semester:2");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Unit Code                          |Unit Name:                               Score");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|"+unitcode1+"                            |Database                                |"+score1+"\n");
		System.out.println("|"+unitcode2+"                            |Systems                                 |"+score2+"\n");
		System.out.println("|"+unitcode3+"                            |Algorithm                               |"+score3+"\n");
		System.out.println("|"+unitcode4+"                            |Statistics                              |"+score4);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Total                                                                       |"+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Average                                                                     |"+avg);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Grade                                                                       |"+grade);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Recommendation                                                              |Recommend Pass");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Grading Criteria                                            Overall Grade(A-D)");
		System.out.println("70-100         A");
		System.out.println("60-70          B");
		System.out.println("50-60          C");
		System.out.println("40-50          D");
		System.out.println("Below 40       F");
		System.out.println("-------------------------------------------------------------------------------------------------");

	}

}
