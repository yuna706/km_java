package ch3;

public class StringSt {
    public static void main(String[] args) {
        String a1 = "hello world";
        String a2 = new String("hello world");
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");
        // 선언부에 따른 비교식
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println();
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));

        String io = "hello java";
        System.out.println("indexOf: " + io.indexOf("java"));

        String con = "hello java";
        System.out.println(con.contains("world"));
        System.out.println(con.contains("java"));

        String ca = "hello java";
        System.out.println(ca.charAt(6));

        String re = "hello java";
        System.out.println(re.replace("a", "b"));
        System.out.println(re.replaceAll("a", "b"));

        String ss = "hello java";
        System.out.println(ss.substring(0, 5));

        String tuc = "hello Java";
        System.out.println(tuc.toUpperCase());
        System.out.println(tuc.toLowerCase());

        String sp = "a:b:c:d";
        String[] result = sp.split(":");
        System.out.println(result);

        for (int i = 0; i < result.length; ++i) {
            System.out.println(result[i]);
        }

        System.out.println(sp.length());
        System.out.println(String.format("I eat %s apples.", 3));
        System.out.printf("I eat %s apples.", 3);
    }
}
