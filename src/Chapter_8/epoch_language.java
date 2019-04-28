package Chapter_8;

public class epoch_language {
	//for¡¢while¡¢do-while
	public static void main(String[] args) {
		int x,y;
		int[] nums = {32,34,65,38,87,56,6,43};
		for (int i = 1;i < 10;i++) {
			System.out.printf("%d * %d = %d",i,i,i*i);
			System.out.println();	
		}
		System.out.println("-------------");
		for(x=0,y=10;x<y;x++,y--) {
			System.out.printf("(x,y)=(%d,%d)",x,y);
			System.out.println();
		}
		System.out.println("-------------");
		System.out.println("-------for each------");
		for(int item:nums) {
			System.out.println("Count is:" + item);
		}
	}
}	
