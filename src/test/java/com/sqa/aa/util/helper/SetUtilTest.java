package com.sqa.aa.util.helper;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class SetUtilTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }

  @Test
  public void gotoAndClick() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void superClick() {
    throw new RuntimeException("Test not implemented");
  }
}
