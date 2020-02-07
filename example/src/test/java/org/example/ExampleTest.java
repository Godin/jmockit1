package org.example;

import mockit.Mocked;
import org.junit.Test;

public class ExampleTest {

  @Mocked
  Example mocked;

  @Test
  public void test() {
    mocked.foo();
  }

}
