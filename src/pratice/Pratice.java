package pratice;

import java.io.IOException;
import java.util.Scanner;

public class Pratice {

	public static void main(String[] argv) throws IOException {
		//模擬有100元買了多少根棒棒糖一根多少元所以是100/棒棒糖數量
		int money = 100 ;
		int lollipop;
		System.out.println("請輸入棒棒糖數量");
		Scanner sc = new Scanner(System.in);
		lollipop = sc.nextInt();
		if (lollipop == 0) {
			sc.close();
			throw new ArithmeticException("您輸入的棒棒糖數量不能為0");
		}
		int price=money/lollipop;
		System.out.println("一根棒棒糖價格:"+price);
		sc.close();
	}

}
