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
public static void main(String[] args){
  int num = 0;
  for(int i = 1; i < 11; i++){
    if(i % 2 == 0){
      num += 1;
    }
  }
  System.out.println(num);
}


// - 3問目
// 1〜10までの整数をカンマ区切りで横並びで表示させる
// (10にはカンマをつけない)



// - 4問目
// 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の
// 奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
}
