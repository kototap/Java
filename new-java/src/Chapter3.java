public class Chapter3 {
  // public static void main(String[] args){
  //   boolean tenki = false;
  //   if (tenki == true){
  //     System.out.println("洗濯をします。");
  //     System.out.println("お散歩もします。");
  //   } else {
  //     System.out.println("DVDを見ます。");
  //   }
  // }

  // public static void main(String[] args){
  //   System.out.println("あなたの運勢を占います。");
  //   int fortune = new java.util.Random().nextInt(4) + 1;
  //   switch(fortune){
  //     case 1:
  //       System.out.println("大吉");
  //       break;
  //     case 2:
  //       System.out.println("中吉");
  //       break;
  //     case 3:
  //       System.out.println("吉");
  //       break;
  //     default:
  //       System.out.println("小吉");
  //   }
  // }

  // public static void main(String[] args){
  //   int temp = new java.util.Random().nextInt(30) + 1;
  //   System.out.println(temp);
  //   // while (temp > 25){
  //   //   temp--;
  //   //   System.out.println("現在の温度は" + temp + "度です。");
  //   // }
  //   do {
  //     temp--;
  //     System.out.println("温度を一度下げました。");
  //   } while (temp > 25);

  //   System.out.println(temp);
  // }

  // public static void main(String[] args){
  //   for (int i = 0; i < 10; i++) {
  //     System.out.println("こんにちは。");
  //   } //10回繰り返したい
  // }


  // public static void main(String[] args){
  //   for (int i = 1; i < 10; i++) {
  //     for (int j = 1; j < 10; j++) {
  //       System.out.println(i * j);
  //       // System.out.println("");
  //     }
  //     System.out.println(""); //改行
  //   }
  // }

  // public static void main(String[] args){
  //   for(int i = 1; i < 10; i++){
  //     if(i == 3){
  //       // break;
  //       continue;
  //     }
  //     System.out.println(i);
  //   }
  // }

  public static void main(String[] args){
    int isHungry = new java.util.Random().nextInt(2); //2以下の数字でランダム・・・０または１
    String  food = "おにぎり";

    System.out.println("こんにちは!");
    
    if (isHungry == 0){
      System.out.println("お腹いっぱいです。");
    } else {
      System.out.println(food + "を食べます。");
      System.out.println("ごちそうさまでした！");
    }

  }
}
