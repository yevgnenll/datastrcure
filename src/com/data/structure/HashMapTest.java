package com.data.structure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class HashMapTest {

  private Map<Integer, Integer> map;

  @Before
  public void setUp() {
    map = new HashMap<>();
    map.put(1, 11111);
    map.put(2, 22222);
    map.put(3, 33333);
    map.put(4, 44444);
    map.put(5, 55555);
  }

  @Test
  public void hashMap에_containsValue는_값이_있을경우_true를_반환한다() {
    assertThat(true, is(map.containsValue(55555)));
  }

}
