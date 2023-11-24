package array;

public class Test {

	public static void main(String[] args) {
		
		// 課題１
		int x = Integer.parseInt(args[0]);
		System.out.println("xを入力してください：" + x);
		// １~9までの整数をかけた結果を表示
		for ( int i = 1; i <= 9; i++ ) {
			int result = x * i;
			// (result + "")の「""」は、数値を文字列に変換して表示。数字と空の文字列が結合され文字列を結果が表示
			System.out.println( result + "" );
		}
		System.out.println("");
		
		// 課題２
		int [] nums = { 20, 1, 2, 23, 5, 11, 5, 67 };
		// 4番目の要素
		int fourthElements = nums[3];
		System.out.println("4番目の要素：" + fourthElements);
		// 要素数
		int arrayLength = nums.length;
		System.out.println("要素数:" + arrayLength);
		// 平均値
		// 合計値を初期化
		double sum = 0;
		// 配列numsの要素をループしてsumの合計を計算
		for ( int i = 0; i < arrayLength; i++ ) {
			sum = sum + nums[i];
		}
		// 平均値を出力
		double average = sum / arrayLength;
		System.out.println("平均値：" + average);
		System.out.println("");
		
		// 課題３
		int [][] array =
		{
			{ 1, 8, 12, 17, 20 },
			{ 2, 5, 11, 13, 18 },
			{ 4, 6, 9, 19, 21 }	
		};
		
		// 二次元配列の縦の要素数
		int rows = array.length;
		// 二次元配列の横の要素数
		int columns = array[0].length;
		// 二次元配列の要素を縦に３つ、横に５つ並べて表示
		for ( int i = 0; i < rows; i++ ) {
			for ( int j = 0; j < columns; j++ ) {
				// printは横に表示したい場合に使用.また、"\t"とは各要素を区切る。
				System.out.print( array[i][j] + "\t" );
			}
			// 行ごとに改行
			System.out.println();
		}
		System.out.println("");
		
		// 課題４
		int n = 4;
		String doller = "$";
		
		// 直角三角形のピラミッド1
		// for文(i)で三角形の高さを定義
		for ( int i = 0; i < n; i++ ) {
			// ２つ目のfor文(j)で”一つずつ増えるように＄を出力
			for ( int j = 0; j <= i; j++ ) {
				System.out.print(doller);
			}
			System.out.println();
		}
		System.out.println("");
		
		// 直角三角形のピラミッド2
		// for文（i）で三角形の高さを定義
		for ( int i = 0; i < n; i++ ) {
			// for文(j)で空白("")を定義。n-iは、最初の空欄が最大、＄の数と反比例して徐々に空欄を減らす
			for ( int j = 0; j < n-i; j++ ) {
				System.out.print(" ");
			}
			// for文(k)で＄を出力。一つずつ増やすので、k <= i;となる
			for ( int k = 0; k <= i; k++ ) {
				System.out.print(doller);
			}
			System.out.println();
		}
		
	}

}
