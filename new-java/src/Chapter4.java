public class Chapter4 {
  // public static void main(String[] args){
  //   int[] scores = new int[7]; //int型の要素を5個作りscoresに代入する
  //   int num = scores.length; //配列変数名.length -> 配列の要素数の取得
  //   System.out.println("要素の数は" + num + "です。");
  // } 

  // public static void main(String[] args){
  //   int[] scores = {20, 30, 40, 50, 80, 100};
  //   int sum = 0;
  //   for(int i = 0; i < scores.length; i++){
  //     sum += scores[i];
  //   }
  //   // int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
  //   int ave = sum / scores.length;
  //   System.out.println("合計点は" + sum + "点です。");
  //   System.out.println(scores.length + "教科の平均点は" + ave + "点です。");
  // }

  // public static void main(String[] args){
  //   int[] scores = {20, 30, 40, 50, 80, 100};
  //   int count = 0;
  //   for(int i = 0; i < scores.length; i++){
  //     if(scores[i] >= 50){
  //       count++;
  //     }
  //   }
  //   System.out.println("50点以上の科目数は" + count);
  // }

  // public static void main(String[] args){
  //   int[] seq = new int[10];
  //   for(int i = 0; i < seq.length; i++){
  //     seq[i] = new java.util.Random().nextInt(4);

  //     char[] base = {'A', 'T', 'G', 'C'};
  //     System.out.print(base[seq[i]] + " ");
  //   }
  // }

  // public static void main(String[] args){
  //   int[] scores = {20, 30, 40, 50};
  //   for(int value : scores){   //拡張for文
  //     System.out.println(value);
  //   }
  // }

  //多次元配列
  // public static void main(String[] args){
  //   int[][] scores = new int[2][3];    //2行3列の配列
  //   scores[0][0] = 40;
  //   scores[0][1] = 50;
  //   scores[0][2] = 60;
  //   scores[1][0] = 80;
  //   scores[1][1] = 60;
  //   scores[1][2] = 70;
  //   System.out.println(scores[1][1] + "点");
  // }

  
  //練習問題

//4-1
  // public static void main(String[] args){
  //   int[] points = new int[4];
  //   double[] weights = new double[5];
  //   boolean[] answers = new boolean[3];
  //   String[] names = new String[3];
  // }

  //4-2
  // public static void main(String[] args){
  //   int[] moneyList = {121902, 8302, 55100};
  //   for(int i = 0; i < moneyList.length; i++){
  //     System.out.println(moneyList[i]);
  //   }
  //   for(int value : moneyList){
  //     System.out.println(value);
  //   }
  // }


  //4-4
  public static void main(String[] args){
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください。");
    int input = new java.util.Scanner(System.in).nextInt();
    for(int n : numbers){
      if(n == input){
        System.out.println("あたり！");
      }
    }
  }
} 
