public class Main {
    public static void main(String[] args) {
        String str = null; // 初期値として null を代入

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // 条件2:
            System.out.println("NullPointerExceptionが発生しました。");

            // 条件3: getMessage()
            System.out.println(e.getMessage());
        }
    }
}
