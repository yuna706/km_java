package ch3;

public class StringBufferSt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("java");
        String result = sb.toString();
        System.out.println(result);

        // 해당 index에 끼워넣기
        sb.insert(0, "hi, ");
        System.out.println(sb.toString());
        System.out.println(sb.substring(0, 9));
    }
}
