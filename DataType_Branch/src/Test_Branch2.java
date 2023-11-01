

// 課題２
import java.util.Scanner;

public class Test_Branch2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("数字Aを入力してください。");
		int numberA = scanner.nextInt();
		
		System.out.print("数字Bを入寮してください。");
		int numberB = scanner.nextInt();
		
		if ( numberA > numberB ) {
			System.out.println("大きい数字は" + numberA + "です");
			
		} else if ( numberA < numberB ) {
			System.out.println("大きい数字は" + numberB + "です");
			
		} else {
			System.out.println("数字Aと数字Bと大きさが同じです。");
		}
	}

}
