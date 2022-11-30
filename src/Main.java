public class Main {
    public static void main(String[] args) {

        // задание 1
        System.out.println("задание 1");

        int[] arrays1 = new int[3]; //{1, 2, 3};
        arrays1[0] = 1;
        arrays1[1] = 2;
        arrays1[2] = 3;

        double[] arrays2 = new double[]{1.57, 7.654, 9.986};

        boolean[] arrays3 = new boolean[5];
        arrays3[0] = true;
        arrays3[1] = true;
        arrays3[4] = true;

        // задание 2
        System.out.println("задание 2");

        int i = 0;
        for (; i < arrays1.length; i++) {
            if (i == 2) {
                System.out.println(arrays1[i]);
            } else
                System.out.print(arrays1[i] + ", ");
        }


        ;
        for (int q = 0; q < arrays2.length; q++) {
            if (q == 2) {
                System.out.println(arrays2[q]);
            } else
                System.out.print(arrays2[q] + ", ");
        }


        int y = 0;
        for (; y < arrays3.length; y++) {
            if (y == 4) {
                System.out.println(arrays3[y]);
            } else
                System.out.print(arrays3[y] + ", ");
        }


        System.out.println();

        // задание 3
        System.out.println("задание 3");

        int a = 2;
        for (; a >= 0; a--) {
            if (a == 0) {
                System.out.println(arrays1[a]);
            } else
                System.out.print(arrays1[a] + ", ");
        }

        int a2 = 2;
        for (; a2 >= 0; a2--) {
            if (a2 == 0) {
                System.out.println(arrays2[a2]);
            } else
                System.out.print(arrays2[a2] + ", ");
        }

        int a3 = 4;
        for (; a3 >= 0; a3--) {
            if (a3 == 0) {
                System.out.println(arrays3[a3]);
            } else
                System.out.print(arrays3[a3] + ", ");
        }
        System.out.println();
        // задание 4
        System.out.println("задание 4");

        int x = 0;
        for (; x < arrays1.length; x++) {
            if (arrays1[x] % 2 != 0) {
                arrays1[x]++;
                System.out.println(arrays1[x]);
            } else {
                if (arrays1[x] % 2 == 0)
                    System.out.println(arrays1[x]);
            }
        }
    }
}
