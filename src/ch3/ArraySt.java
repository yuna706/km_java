package ch3;

public class ArraySt {
    public static void main(String[] args) {
        int[] var10000 = new int[]{1, 2, 2, 3, 5};
        String[] weeks = new String[]{"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weeks[3]);
        System.out.println(weeks.length);

        for(int i = 0; i < weeks.length; ++i) {
            System.out.println(String.format("오늘은 %s요일, 내일은 %s요일", weeks[i], weeks[i + 1]));
        }
    }
}
