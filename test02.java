import java.net.SocketPermission;

class test02 {
    void c() {

        for (int b = 1; b <= 50; b++) {
            if (b % 2 == 0) {

                System.out.println("even number");

                System.out.println(b);

            }
        }

    }

}

class bikash extends test02 {

    public static void main(String[] args) {
        for (int e = 51; e >= 100; e++) {

            if (e % 2 == 0) {

                System.out.println("even number=" + e);
            }

            else {
                System.out.println("odd number");
            }

        }
        test02 h = new test02();

        h.c();
    }
}
