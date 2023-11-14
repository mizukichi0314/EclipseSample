package array;

public class CmdLine {

	public static void main(String[] args) {
		// args[0]の文字列を表示、さらに実際にコマンドラインから入力された文字列を連結して画面に表示
		System.out.println("args[0]:" + args[0]);
		System.out.println("args[1]:" + args[1]);
		// args.lengthの文字列を表示、また、何個のデータがコマンドラインから入力されたのか取得し画面に表示
		System.out.println("args.length:" + args.length);

	}

}
