package array;

public class Array {

	public static void main(String[] args) {
		// new intで3つの整数を入れる配列scoreを作る
		int [] score = new int[3];
		// score[0]に85を代入
		score[0] = 85;
		// score[1]に100を代入
		score[1] = 100;
		// score[2]に75を代入
		score[2] = 75;
		// String型を初期値にし、それぞ3人の名前（菅原、村山、寺島）を代入
		String[] name = { "菅原", "村山", "寺島" };
		// それぞれの3人の名前と点数を表示
		System.out.println( name[0] + "さん：" + score[0] + "点" );
		System.out.println( name[1] + "さん：" + score[1] + "点" );
		System.out.println( name[2] + "さん：" + score[2] + "点" );
		// score.lenghtで配列scoreの要素数である３を表示（9、11、13行目）
		System.out.println( "受験者数：" + score.length + "人" );
		
	}

}
