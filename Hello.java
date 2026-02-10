class Hello {
    public static void main(String a[]) {
        // int num1 = 3;
        // int num2 = 4;
        // int result = num1 + num2;
        // System.out.println(result);
        // System.out.println("Hello, World!");
        byte n1 = 125;
        int n2 = n1;
        int n4 = 12;
        int n5 = 257;
        byte n3 = (byte) n4;
        byte n6 = (byte) n5;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n6);

        float f1 = 3.14f;
        int n7 = (int) f1;
        System.out.println(n7);

        // Type promotion in expressions
        byte b1 = 10;
        byte b2 = 30;
        int sum = b1 * b2; // b1 and b2 are promoted to int
        System.out.println(sum);
    }
}