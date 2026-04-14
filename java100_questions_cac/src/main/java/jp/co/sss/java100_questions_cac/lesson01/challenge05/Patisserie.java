/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		int citro = 30;

		int choco = 30;

		int pis = 30;

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン　　　\\250・・・残り" + citro + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + choco + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pis + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン      >");
		String citronBuy = br.readLine();
		int citronBuyCount = Integer.parseInt(citronBuy);

		System.out.print("ショコラ      >");
		String chocolatBuy = br.readLine();
		int chocolatBuyCount = Integer.parseInt(chocolatBuy);

		System.out.print("ピスターシュ  >");
		String pistacheBuy = br.readLine();
		int pistacheBuyCount = Integer.parseInt(pistacheBuy);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		int sum1 = citronBuyCount + chocolatBuyCount + pistacheBuyCount;

		System.out.println("\n合計個数  " + sum1 + "個");

		int sum2 = (250 * citronBuyCount) + (280 * chocolatBuyCount) + (320 * pistacheBuyCount);

		System.out.println("合計金額  " + sum2 + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

	}

}
