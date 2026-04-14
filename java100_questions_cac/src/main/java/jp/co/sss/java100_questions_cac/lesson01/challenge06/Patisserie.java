/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge06;

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
		//それぞれの個数を足して合計個数を算出する

		System.out.println("\n合計個数  " + sum1 + "個");

		int sum2 = (250 * citronBuyCount) + (280 * chocolatBuyCount) + (320 * pistacheBuyCount);
		//それぞれの値段と個数をかけて合計の金額を算出する

		System.out.println("合計金額  " + sum2 + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン　　　\\250・・・残り" + (citro - citronBuyCount) + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (choco - chocolatBuyCount) + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (pis - pistacheBuyCount) + "個");

	}

}
