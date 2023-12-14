//Review03 という名前のクラス（メインメソッドあり）を作成。
//メインメソッドの中で BaseBallTeam のインスタンスを6個生成し、それぞれのチームの名前、勝ち数、負け数、引き分け数を格納。
//report メソッドを呼び出して、勝敗情報を表示する。
//東京ヤクルトスワローズ の2022年の成績は 80勝 59敗 4分、勝率は 0.5755395683453237です。
//横浜DeNAベイスターズ の2022年の成績は 73勝 68敗 2分、勝率は 0.5177304964539007です。

package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team01 = new BaseBallTeam();
        team01.name = "東京ヤクルトスワローズ";
        team01.win = 80;
        team01.lose = 59;
        team01.draw = 4;
        team01.report();

        BaseBallTeam team02 = new BaseBallTeam();
        team02.name = "横浜DeNAベイスターズ";
        team02.win = 73;
        team02.lose = 68;
        team02.draw = 2;
        team02.report();

        BaseBallTeam team03 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        team03.report();


    }

}
