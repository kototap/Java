public class Chapter5 {
  // public static void main(String[] args){
  //   System.out.println("メソッドを呼び出します。");
  //   hello();    //helloメソッドの呼び出し
  //   System.out.println("メソッドを呼び出しました。");
  // }
  // //メソッドの本体
  // public static void hello(){
  //   System.out.println("こんにちは！");
  // }


  //コード5-3
  // public static void methodA(){
  //   System.out.println("methodA");
  //   methodB();
  // }

  // public static void methodB(){
  //   System.out.println("methodB");
  // }

  // public static void main(String[] args){
  //   methodA();
  // }


  //コード5-4 引数の利用
    // public static void main(String[] args){
    //   System.out.println("メソッドを呼び出します");
    //   hello("京本");
    //   hello("森本");
    //   hello("田中");
    //   System.out.println("メソッドの呼び出し終了");
    // }

    // public static void hello(String name){    //String nameで文字型変数nameを宣言
    //   System.out.println(name + "さんこんにちは！");
    // }


    //コード5-5
    // public static void main(String[] args){
    //   add(100, 200);
    //   add(300, 50);
    // }
    // public static void add(int x, int y){
    //   int ans = x + y;
    //   System.out.println(ans);
    // }

    //コード5-7

    public static int add(int x, int y){
      int ans = x + y;
      return ans;
    }
    public static void main(String[] args){
      int ans = add(100, 10);
      System.out.println("100+10は" + ans);
    }
}
