package Chapter_8;

public class branch_language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 95;
		char grade;
		/*
		 * if_struct
		 * 
		
		if(score >= 85){
			System.out.println("优秀!");
		}
		if(score <60){
			System.out.println("不及格！");
		}
		if((score>=60) && (score<=85)) {
			System.out.println("良好！");
		}
		
		*/

		/*
		 *if-else struct
		 
		if(score >= 85){
			System.out.println("优秀!");
		} else {
			System.out.println("不够优秀");
		}
		 */
		
		
		/*
		 * else-if struct
		 
		if(score >= 90){
			grade = 'A';
		}else if(score >=80){
			grade = 'B';
		}else if(score >=70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("Grade:" + grade);
		
		*/
		
		
		/*
		 * switch struct
		 */
		switch(score / 10) {
		case 9:
			 grade = '优';
			 break;
		case 8:
			 grade = '良';
			 break;
		case 7:
		case 6:
			 grade = '中';
			 break;
		default:
			 grade = '差';
		}
		System.out.println("Grade:" + grade);
	}

}
