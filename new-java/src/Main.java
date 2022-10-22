public class Main {
  // public static void main(String[] args) {
  //   System.out.println("すがわら");

  // } 
  // public static void main(String[] args) {
  //   int age;
  //   age = 30;
  //   System.out.println("私の年齢は" + age);
  //   // 再代入
  //   age = 35;
  //   System.out.println("...いや本当は" + age + "歳");
  // }

  // public static void main(String[] args) {
  //   double pi = 3.14;
  //   int pie = 5;
  //   System.out.println("半径" + pie + "cmのパイの面積は、");
  //   System.out.println(pie * pie * pi);
  //   System.out.println("パイの半径を倍にします");
  //   pie = 10;
  //   System.out.println("半径" + pie + "cmのパイの面積は、");
  //   System.out.println(pie * pie * pi);
  // }

  // public static void main(String[] args) {
  //   int a;
  //   int b;
  //   a = 20;
  //   b = a + 5;
  //   System.out.println(a);
  //   System.out.println(b);
  //   System.out.println("私の好きな記号は二重引用符（\"）です");
  // }

  // public static void main(String[] args){
  //   System.out.println("私の好きな記号は二重引用符(\")です。\nあなたは？\n僕は引用符(\')と(\\)だよ。");
  // }


  // public static void main(String[] args) {
  //   int a = 3;
  //   int b = 5;

  //   int m = Math.max(a, b); //大きい方の数値を代入する
  //   System.out.println(m);
  // }

  // public static void main(String[] args){
  //   String age = "31";
  //   int n = Integer.parseInt(age);   //文字列を数値に変換する

  //   System.out.println
  //     ("あなたは来年" + (n + 1) + "歳になりますね");
  // }

    // public static void main(String[] args){
    //   int r = new java.util.Random().nextInt(90); //乱数を生み出して代入

    //   System.out.println("あなたは多分" + r + "歳ですね");
    // }

    public static void main(String[] args){
      System.out.println("あなたの名前を入力してください。");
      String name = new java.util.Scanner(System.in).nextLine();  //文字列の入力
      System.out.println("あなたの年齢を入力してください。");
      int age = new java.util.Scanner(System.in).nextInt();   //数値の入力
      System.out.println
        ("ようこそ、" + age + "歳の" + name + "さん。");
    }

}
