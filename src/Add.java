public class Add {
    static int add (int a, int b){
        return a + b ;
    }

    static double add ( double a , double b){
        return  a = b ;
    }

    static class TestOverLoading {
        public static void main(String[] args) {
            System.out.println(Add.add(11,20));
            System.out.println(Add.add(11.5,23.5));
        }
    }

}
