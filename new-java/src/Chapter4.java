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

  public static void main(String[] args){
    int[] seq = new int[10];
    for(int i = 0; i < seq.length; i++){
      seq[i] = new java.util.Random().nextInt(4);

      char[] base = {'A', 'T', 'G', 'C'};
      System.out.print(base[seq[i]] + " ");
    }
  }
}
