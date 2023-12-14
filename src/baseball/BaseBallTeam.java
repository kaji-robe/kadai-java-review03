//■仕様まとめ■
//以下のフィールドを BaseBallTeam に持たせるカプセル化を使う。
//name（String型）
//win（int型）
//lose（int型）
//draw（int型）

//勝率はフィールドとして持たせず、getRateメソッドを。
//「勝ち数/(勝ち数+負け数)」の計算で求める。
//この計算結果を小数値（double）で戻す
//getRate メソッドを BaseBallTeam に作る。

//report というメソッドを BaseBallTeam に作る。
//○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。と表示するメソッド

//チーム名／勝数／負け数／引き分け数は、以下のどちらかの方法で参照してください：
////自クラス内のフィールドを直接参照する方法
//getterメソッドを用いて値を参照する方法
//※いずれにしても勝率はgetRateメソッドを用いて値を取得してください

//Review03 という名前のクラス（メインメソッドあり）を作成。
//メインメソッドの中で BaseBallTeam のインスタンスを6個生成し、それぞれのチームの名前、勝ち数、負け数、引き分け数を格納。
//report メソッドを呼び出して、勝敗情報を表示する。
//東京ヤクルトスワローズ の2022年の成績は 80勝 59敗 4分、勝率は 0.5755395683453237です。
//横浜DeNAベイスターズ の2022年の成績は 73勝 68敗 2分、勝率は 0.5177304964539007です。
//■仕様まとめここまで■

package baseball;

public class BaseBallTeam {

    //パブリックなフィールド
    private String name;     //球団名
    private int win;         //勝ち回数
    private int lose;        //負け回数
    private int draw;        //引き分け回数

    //引数なしのコンストラクタ（念のための記述）
    public BaseBallTeam() {
    }

    //引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率の計算メソッド
    public double getRate() {
        double result = (double)win / (win + lose);
        return result;
    }

    //勝敗情報の呼び出しメソッド
    public void report() {
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + getRate() + "です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }


}
