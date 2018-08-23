package com.diffblue.javademo;

public class Sort {
  /**
   * asc.
   */
  public static int[] asc() {
    int[] xx = { 3, 5, 42, 1, 72, 32};
    java.util.Arrays.sort(xx);
    return xx;
  }

  /**
   * DescComparator.
   */
  static class DescComparator implements java.util.Comparator<Integer> {
    public int compare(Integer aa, Integer bb) {
      if (aa > bb)  {
        return -1;
      }
      if (aa < bb) {
        return 1;
      }
      return 0;
    }
  }
  
  /**
   * desc.
   */
  public static Integer[] desc() {
    Integer[] xx = { 3, 5, 42, 1, 72, 32};
    java.util.Arrays.sort(xx, new DescComparator());
    return xx;
  }

  /**
   * reverse.
   */
  public static java.util.List<Integer> reverse() {
    java.util.ArrayList<Integer> xx = new java.util.ArrayList<Integer>();
    xx.add(3);
    xx.add(42);
    xx.add(5);
    xx.add(7);
    java.util.Collections.reverse(xx);
    return xx;
  }
}

