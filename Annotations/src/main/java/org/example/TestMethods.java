package org.example;

public class TestMethods {

    public static void zeroMethod() {

    }
    @AdditionalInfo("Быстрый метод")
    public static void firstMethod() {
        for (int i = 0; i < 100; i++) {

        }
    }

    @AdditionalInfo("Не очень быстрый метод")
    public static void secondMethod() {
        for (int i = 0; i < 10000000; i++) {

        }
    }

    /**
     * Какое-то осмысленное описание метода (Java Doc)
     */
    @AdditionalInfo("Не стоит запускать! Очень медленный метод")
    public static void thirdMethod() {
        for (int i = 0; i < 10000000; i++) {
            for (int j = 0; j < 10000000; j++) {
                for (int l = 0; l < 10000000; l++) {

                }
            }
        }
    }
}
