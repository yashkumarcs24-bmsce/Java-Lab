class Factorial{
    public static void main(String[] args) {
        int n=6;
        int factorial=1;
        for (int i = 1; i <= 6; i++) {
            factorial*=i;
        }
        System.out.println("The factorial of number 6 is: "+factorial);
    }
}