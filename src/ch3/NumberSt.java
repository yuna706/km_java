package ch3;

public class NumberSt {
    public static void main(String[] args) {
        // 정수
        int age = 20;
        long countOfStar = 123456789012345678L;

        // 실수
        float pi = 3.14F;
        double morePi = 3.141592654581;

        // 8진수, 10진수
        int octal = 012;
        int hex = 0xC;


        // 숫자 연산
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 증감 연산자
        System.out.println(a++);
        ++a;
        System.out.println(a);
        a = a + 1;
        a += 1;
        ++a;
        System.out.println(a++); // 15 출력
    }
}
