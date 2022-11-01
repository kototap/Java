public class Chapter6 {
 public static void main(String[] args){
  int a = 10;
  int b = 2;
  int total = Chapter6CalcLogic.tasu(a, b);  //別ファイルから持ってくるのでクラス名を書く。
  int delta = Chapter6CalcLogic.hiku(a, b);
  System.out.println("足すと" + total + "引くと" + delta);
 } 

}
