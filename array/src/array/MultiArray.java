package array;

public class MultiArray {

	public static void main(String[] args) {
		// 二次元配列宣言、new int[2][3]で2行3列の多次元配列を作る
		int[][] allScore = new int [2][3];
		// それぞれの数をallScoreに代入
		allScore[0][0] = 80;
		allScore[0][1] = 100;
		allScore[0][2] = 75;
		allScore[1][0] = 85;
		allScore[1][1] = 95;
		allScore[1][2] = 80;
		
		// 多次元配列の初期化のやり方
		// int[][] allScore = { {10,20,30}, {40,50,60} };
		// 中括弧の中に中括弧を書く
		
		// それぞれのallScoreの配列の中身を表示
		System.out.println( allScore[0][0] + "点" );
		System.out.println( allScore[0][1] + "点" );
		System.out.println( allScore[0][2] + "点" );
		System.out.println( allScore[1][0] + "点" );
		System.out.println( allScore[1][1] + "点" );
		System.out.println( allScore[1][2] + "点" );
		
		// allScore.lengthの文字列と実際のallScore.lengthの値を表示
		// allScoreが指す配列の要素数は縦に二つ並んでいるので2になる
		System.out.println( "allScore.length:" + allScore.length );
		// allScore[0].lenghtの文字列と実際のallScore[0].lengthの値を表示
		// allScore[0]が指す配列の要素数は3つになる
		System.out.println( "allScore[0].length:" + allScore[0].length );
		
	}

}

/*
int[][] allScore = { {10,20,30}, {40,50,60} };

		System.out.println( allScore[0][0] + "点" );
		System.out.println( allScore[0][1] + "点" );
		System.out.println( allScore[0][2] + "点" );
		System.out.println( allScore[1][0] + "点" );
		System.out.println( allScore[1][1] + "点" );
		System.out.println( allScore[1][2] + "点" );
		
		// allScore.lengthの文字列と実際のallScore.lengthの値を表示
		// allScoreが指す配列の要素数は縦に二つ並んでいるので2になる
		System.out.println( "allScore.length:" + allScore.length );
		// allScore[0].lenghtの文字列と実際のallScore[0].lengthの値を表示
		// allScore[0]が指す配列の要素数は3つになる
		System.out.println( "allScore[0].length:" + allScore[0].length );
		
		上記コードでもコンパイル・実行できる
		
*/
