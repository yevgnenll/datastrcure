package com.data.structure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Before;

public class TreeSetTest {

  private TreeSet<Integer> treeSet;

  @Before
  public void TreeSet에_최초_데이터를_저장한다() {
    treeSet = new TreeSet<>();
    treeSet.add(11111);

  }
}
