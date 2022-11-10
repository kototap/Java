public class Pra2 {
// - 1問目
// 1〜10までの数字のうち偶数のみを昇順で表示させる
// public static void main(String[] args){
//   for(int i = 1; i < 11; i++){
//     if(i % 2 == 0){
//       System.out.println(i);
//     }
//   }
// }


// - 2問目
// 1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
// public static void main(String[] args){
//   int num = 0;
//   for(int i = 1; i < 11; i++){
//     if(i % 2 == 0){
//       num += 1;
//     }
//   }
//   System.out.println(num);
// }


// - 3問目
// 1〜10までの整数をカンマ区切りで横並びで表示させる
// (10にはカンマをつけない)
// public static void main(String[] args){
//   for(int i = 1; i < 11; i++){
//     if(i < 10){
//       System.out.print(i + ",");
//     } else {
//       System.out.print(i);
//     }
    
//   }
// }


// - 4問目
// 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の
// 奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
public static void main(String[] args){
  
  int num[] = new int[20];
  
  num[0] = 0;
  
  for (int i = 1; i < num.length; i++){
    num[i] = num[i - 1] + 5;
  }

  boolean first = true;
  System.out.print("奇数：");
  for(int i = 1; i < 11; i++){
    if(num[i] % 2 == 1){
      if(first){
        System.out.print(num[i]);
        first = false;
      } else {
        System.out.print("," + num[i]);
      }
    }
  }

  System.out.println();
  first = true;

  System.out.print("偶数：");
  for(int i = 11; i < 20; i++){
    if(num[i] % 2 == 0){
      if(first){
        System.out.print(num[i]);
        first = false;
      } else {
        System.out.print("," + num[i]);
      }
    }
  }
}

}
