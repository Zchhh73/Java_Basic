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
			System.out.println("����!");
		}
		if(score <60){
			System.out.println("������");
		}
		if((score>=60) && (score<=85)) {
			System.out.println("���ã�");
		}
		
		*/

		/*
		 *if-else struct
		 
		if(score >= 85){
			System.out.println("����!");
		} else {
			System.out.println("��������");
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
			 grade = '��';
			 break;
		case 8:
			 grade = '��';
			 break;
		case 7:
		case 6:
			 grade = '��';
			 break;
		default:
			 grade = '��';
		}
		System.out.println("Grade:" + grade);
	}

}
