package com.data.structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class HashSetTest {

  @Test
  public void hashSet에_대하여_알아본다() {

    int[] a = new int[] {0, 1, 2, 3};

    Map<Integer, Integer> result = new HashMap<>();
    for (int i = 0; i < a.length ; i++) {
      int num = a[i];
      result.put(num, i);
    }

    for (int i : result.keySet()) {
      result.containsKey(i);
      if (result.containsKey(i) && result.containsValue(i)) {
      }
    }

  }
}
