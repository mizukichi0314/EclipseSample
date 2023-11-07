
// int num = Integer.paserInt(args[0]);
// switch( num ) {
// case 1:
// System.out.println("入園料金：8,400円");
// break;
// case 2:
// System.out.println("入園料金：7,000円");
// break;
// case 3;
// System.out.println("入園料金：5,000円");
// break;
// default:
// System.out.println("1:一般, 2:中・高校生, 3:小学生・幼児");

public class Test_Branch {

	public static void main(String[] args) {
		// 課題１
		// 上記、switch文をif-else文に書き直した場合
		// コマンドライン引数から整数を取得
		int num = Integer.parseInt(args[0]);
		// 整数が１と入力された場合
		if (num == 1) {
			// 一般の入園料金：8400円と表示
			System.out.println("入園料金：8,400円");
		//　整数が２と入力された場合
		} else if (num == 2){
			// 中・高校生の入園料金：7000円と表示
			System.out.println("入園料金：7,000円");
		// 整数が３と入力された場合
		} else if (num == 3){
			// 小学生・幼児の入園料金：5000円と表示
			System.out.println("入園料金：5,000円");	
		// それ以外の場合
		} else {
			// 1:一般,2:中・高校生,3:小学生・幼児と表示
			System.out.println("1:一般, 2:中・高校生, 3:小学生・幼児");	
		}
		
	}

}
