package com.data.structure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import org.junit.Before;
import org.junit.Test;


public class QueueExampleTest {

  private Queue<Integer> queue;

  @Before
  public void queue의_최초_데이터를_정의한다() {
    queue = new LinkedList<>();
    ((LinkedList<Integer>) queue).add(11111);
    ((LinkedList<Integer>) queue).add(22222);
    ((LinkedList<Integer>) queue).add(33333);
    ((LinkedList<Integer>) queue).add(44444);
    ((LinkedList<Integer>) queue).add(55555);
  }

  @Test
  public void queue는_처음에_추가한_데이터가_최초로_나온다() {
    assertThat(11111, is(queue.peek()));
    assertThat(11111, is(queue.element()));
    assertThat(11111, is(queue.poll()));
  }

  @Test
  public void peek_element_method는_데이터를_가져오기만_할뿐_삭제하지_않는다() {
    assertThat(queue.peek(), is(11111));
    assertThat(5, is(queue.size()));
    assertThat(queue.element(), is(11111));
    assertThat(5, is(queue.size()));
  }

  @Test
  public void poll_method는_데이터를_가져오고_queue내에서_삭제를_일으킨다() {
    queue.poll();
    assertThat(4, is(queue.size()));
    assertThat(22222, is(queue.poll()));
    assertThat(33333, is(queue.poll()));
    assertThat(44444, is(queue.poll()));
    assertThat(55555, is(queue.poll()));
    assertThat(0, is(queue.size()));
  }

  @Test
  public void poll은_데이터가_없을경우_null을_반환한다() {
    queue.poll();
    queue.poll();
    queue.poll();
    queue.poll();
    queue.poll();
    assertThat(null, is(queue.poll()));
  }

  @Test(expected = NoSuchElementException.class)
  public void element는_데이터가_없을경우_NoSuchElementException을_일으킨다() {
    queue.poll();
    queue.poll();
    queue.poll();
    queue.poll();
    queue.poll();
    queue.element();
  }

}
