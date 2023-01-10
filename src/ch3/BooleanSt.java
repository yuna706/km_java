package ch3;

public class BooleanSt {
    public static void main(String[] args) {
        boolean isSuccess = true;
        boolean isTest = false;
        System.out.println(isSuccess);
        System.out.println(isTest);
        int base = 180;
        int height = 185;
        boolean isTall = height > base;
        if (isTall) {
            System.out.println("키가 큽니다.");
        }
    }
}
