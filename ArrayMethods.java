public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    if (x > ary.length - 1){
      return sum;
    }
    for (int i = 0; i < ary[x].length; i += 1){
      sum += ary[x][i];
    }
    return sum;
  }
  public static int columnSum(int[][] ary, int x){
    int sum = 0;
    for (int i = 0; i < ary.length; i += 1){
      if (x > ary[i].length - 1){
        sum +=  0;
      }
      else{
        sum += ary[i][x];
      }
    }
    return sum;
  }
  public static int[] allRowSums(int[][] ary){
    int[] newary = new int[ary.length];
    for (int i = 0; i < ary.length; i += 1){
      newary[i] = rowSum(ary, i);
    }
    return newary;
  }
  public static int[] allColSums(int[][] ary){
    int largestrow = 0;
    for (int i = 0; i < ary.length; i += 1){
      if (ary[i].length > largestrow){
        largestrow = ary[i].length;
      }
    }
    int[] newary = new int[largestrow];
    for (int i = 0; i < largestrow; i += 1){
      newary[i] = columnSum(ary, i);
    }
    return newary;
  }
  public static boolean isRowMagic(int[][] ary){
    int first = rowSum(ary, 0);

    for (int i = 1; i < ary.length; i += 1){
      if (! (first == rowSum(ary, i))){
        return false;
      }
    }
    return true;
  }
  public static boolean isColumnMagic(int[][] ary){
    int first = columnSum(ary, 0);
    for (int i = 1; i < ary.length; i += 1){
      if (! (first == columnSum(ary, i))){
          return false;
      }
    }
    return true;
  }
}
