public class Main {
    public static void main(String[] args) {
        int count = 10;
        int z = 9;
        int l = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
                if (j==z) {
                    for (int k = 0; k < l; k++) {
                        System.out.print("*");
                    }
                    l+=2;
                    break;
                }


            }
            System.out.println();



        }
    }
}