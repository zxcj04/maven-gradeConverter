package com.GradeConverter;

/**
 * Hello world!
 *
 */
public class App {
    protected App() {
        throw new UnsupportedOperationException();
    }

    /**
     * This is main method.
     *
     * @param args the arguments
     */
    public static void main(final String[] args) {
        GradeConverter converter = new GradeConverter();

        final int testNumber = 100;
        System.out.println(converter.convert(testNumber));
    }
}
