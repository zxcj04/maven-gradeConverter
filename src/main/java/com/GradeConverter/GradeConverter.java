package com.GradeConverter;

/**
 * This is a class for converting grades.
 *
 */
public class GradeConverter {

  /**
   * This is a method for converting grades.
   *
   * @param score
   * @return grade class
   */
  public String convert(final int score) {
    final int classA = 100;
    final int classB = 90;
    final int classC = 80;
    final int classD = 70;
    final int classE = 60;
    final int zero = 0;
    if (score <= classA && score >= classB)
    {
      return "A";
    } else if (score < classB && score >= classC) {
      return "B";
    } else if (score < classC && score >= classD) {
      return "C";
    } else if (score < classD && score >= classE) {
      return "D";
    } else if (score < classE && score >= zero) {
      return "E";
    } else {
      return "Invalid";
    }
  }

}
