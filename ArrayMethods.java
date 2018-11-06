public class ArrayMethods{
  public static int rowSum(int[][] ary, int x){
    int sum = 0;
    if (ary[x].length - 1 < x){
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
      if (ary[i].length < x){
        return 0;
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
    int[] newary = new int[ary.length];
    for (int i = 0; i < ary.length; i += 1){
      newary[i] = columnSum(ary, i);
    }
    return newary;
  }
  public static boolean isRowMagic(int[][] ary){
    return false;
  }
  public static boolean isColumnMagic(int[][] ary){
    return false;
  }
}
