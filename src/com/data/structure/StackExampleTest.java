package com.data.structure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class StackExampleTest {

  private Stack<Integer> stack;

  @Before
  public void stack_초기_데이터_설정() {
    stack = new Stack<>();
    stack.add(11111);
    stack.add(22222);
    stack.add(33333);
    stack.add(44444);
    stack.add(55555);
  }


  @Test
  public void stack에_데이터를_추가하면_갯수가_중가한다() {
    stack.add(00000);
    assertThat(6, is(stack.size()));
  }

  @Test
  public void peek함수는_데이터를_가져오기만_할뿐_실제_데이터_갯수는_달라지지_않는다() {
    assertThat(55555, is(stack.peek()));
    assertThat(5, is(stack.size()));
  }

  @Test
  public void pop함수는_데이터를_가져오고_가져온_데이터는_삭제한다() {
    assertThat(55555, is(stack.pop()));
    assertThat(4, is(stack.size()));
    assertThat(44444, is(stack.peek()));
  }

  @Test
  public void stack은_마지막에_추가한_값이_가장_먼저_나온다() {
    stack.add(00000);
    assertThat(00000, is(stack.peek()));
    assertThat(00000, is(stack.pop()));
  }

}
