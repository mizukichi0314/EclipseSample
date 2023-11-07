

// 課題２

import java.util.Scanner;

public class Test_Branch2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("数字Aを入力してください");
		int numberA = scanner.nextInt();
		
		System.out.print("数字Bを入力してください");
		int numberB = scanner.nextInt();
		
		if ( numberA > numberB ) {
			System.out.println("大きい数字は" + numberA + "です");
			
		} else if ( numberA < numberB ) {
			System.out.println("大きい数字は" + numberB + "です");
			
		} else {
			System.out.println("数字Aと数字Bの大きさは同じです");
		}
	}

}

// Scannerを使用してユーザーから入力された数字を受け取る(ここでは二つの整数を受け取る)
// nextInt()メソッドを使用してユーザーから入力されたを数字を読み取る
// if~else文を使用して二つの数字を比較し、適切なメッセージを表示
// それ以外（同じ数字の場合）は、elseの（””数字Aと数字Bの大きさは同じです）と表示

