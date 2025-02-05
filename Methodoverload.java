class math {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class Methodoverload {
    public static void main(String[] args) {
        math c1 = new math();
        System.out.println(c1.add(5, 10));    
        System.out.println(c1.add(5.5, 2.5));   
    }
}

