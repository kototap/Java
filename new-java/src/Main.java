public class Main {
  public static void main(String[] args){
    //勇者を生成
    Hero h = new Hero();

    //フィールドに初期値を設定(変数名.フィールド名 = 値;)
    h.name = "ことね";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");

    //Heroのメソッドを呼び出す。
    h.sit(5);
    h.slip();
    h.sit(25);
    
    h.run();
  }
}
