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
    // public static int add(int x, int y){
    //   int ans = x + y;
    //   return ans;
    // }
    // public static void main(String[] args){
    //   int ans = add(100, 10);
    //   System.out.println("100+10は" + ans);
    // }

    //コード5-10 　仮引数が異なれば、同じ名前のメソッドを複数定義できる
    // public static int add(int x, int y){
    //   return x + y;
    // }

    // public static double add(double x, double y){
    //   return x + y;
    // }

    // public static String add(String x, String y){
    //   return x + y;
    // }

    // public static void main(String[] args){
    //   System.out.println(add(10, 20));
    //   System.out.println(add(3.5, 2.7));
    //   System.out.println(add("Hello", "World"));
    // }


    //コード5-11  仮引数の個数が違う場合も同じ名前のメソッドを定義できる
    // public static int add(int x, int y){
    //   return x + y;
    // }
    // public static int add(int x, int y, int z){
    //   return x * y * z;
    // }

    // public static void main(String[] args){
    //   System.out.println(add(10, 30));
    //   System.out.println(add(4, 2, 10));
    // }


    //コード5-12
    // public static void printArray(int[] array){
    //   for(int element : array){
    //     System.out.println(element);
    //   }
    // }
    // public static void main(String[] args){
    //   int[] array = {1, 2, 3};
    //   printArray(array);
    // }

    //コード5-13
    // public static void incArray(int[] array){
    //   for(int i = 0; i < array.length; i++){
    //     array[i]++;
    //   }
    // }
    // public static void main(String[] args){
    //   int[] array = {1, 2, 3, 4, 50};
    //   incArray(array);
    //   for(int element : array){
    //     System.out.println(element);
    //   }
    // }

    //コード5-14
    public static int[] makeArray(int size){
      int[] newArray = new int[size];
      for (int i = 0; i < newArray.length; i++){
        newArray[i] = i;
      }
      return newArray;
    }
    public static void main(String[] args){
      int[] array = makeArray(6);
      for (int i : array){
        System.out.println(i);
      }
    }
  }
