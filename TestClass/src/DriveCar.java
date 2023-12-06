
public class DriveCar {

	public static void main(String[] args) {
		// carクラスのオブジェクトc1を作成
		Car c1 = new Car();
		// c1のナンバーを2525に設定
		c1.no = 2525;
		// c1の速度を30に設定
		c1.speed = 30;
		// c1のナンバー、速度を表示
		c1.display();
		// c1の速度を０に設定
		c1.speed = 0;
		// c1のナンバー、速度を表示
		c1.display();

	}

}
