class SingleInheritance {
    static int num1 = 10;
    static int num2 = 5;
}

class MainInheritance extends SingleInheritance {
    public static void main(String[] args) {
        int num3 = 2;
        int result = num1 + num2 + num3;
        System.out.println(result);
    }
}