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

  public static void main(String[] args){
    System.out.println("あなたの運勢を占います。");
    int fortune = new java.util.Random().nextInt(4) + 1;
    switch(fortune){
      case 1:
        System.out.println("大吉");
        break;
      case 2:
        System.out.println("中吉");
        break;
      case 3:
        System.out.println("吉");
        break;
      default:
        System.out.println("小吉");
    }
  }

}