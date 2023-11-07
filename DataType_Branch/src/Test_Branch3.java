
// 課題３

import java.util.Scanner;

public class Test_Branch3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("正の整数を入力してください。");
		int x = scanner.nextInt();
		
		if ( x > 0 ) {
			
			if ( x % 2 == 0 ) {
				System.out.println( x + "は偶数です。");
				
			} else {
				System.out.println( x + "は奇数です。");
				
			}
			
		} else {
			System.out.println("正の整数を入力してください。");
			
		}
		
	}

}

// if ( x > 0) とは、変数ｘの値が０より大きいかどうかの確認。つまり正の整数を入力をしているかの確認。
// よって、負の数や０は正の整数ではない為、ユーザーに正の整数を入力するように促している
// if ( x % 2 == 0 ) とは、xを2で割った余りが０かどうかの確認で、ここで偶数か奇数の判断をしている。
// その為、xが2で割り切れる場合は、余りは０になるため偶数。割り切れない場合は奇数となる。
