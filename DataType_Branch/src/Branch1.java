
// int price = Integer.parseInt(args[0]);
		// double rate = 0.10;
		// int discount, amount;
		
		// if( price >= 3000 ) {
			// discount = 300;
		// } else {
			// discount = 0;
		// }
		
		// amount = (int)((price - discount) * (1 + rate));
		// System.out.println("値引金額：" + discount + "円");
		// System.out.println("税込金額：" + amount + "円");
public class Branch1 {

	public static void main(String[] args) {
		//上記サンプコードをif~else文に書き直した場合	
		int price = Integer.parseInt(args[0]);
		double rate = 0.10;
		int discount, amount;
		
		if( price >= 5000 ) {
			discount = 500;
		} else if ( price >= 3000 ) {
			discount = 300;
		} else {
			discount = 0;
			
			amount = (int)(( price - discount ) * ( 1 + rate ));
			System.out.println("値引金額：" + discount + "円");
			System.out.println("税込金額：" + amount + "円");
		}

	}

}
