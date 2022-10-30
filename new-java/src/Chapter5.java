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
  public static void methodA(){
    System.out.println("methodA");
    methodB();
  }

  public static void methodB(){
    System.out.println("methodB");
  }

  public static void main(String[] args){
    methodA();
  }
}
