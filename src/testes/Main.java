package testes;

public class Main {
        static class A{
            public A(int x){
                System.out.println("A1");
            }
        }

    static class B extends A{
            public B(){
                super(0);
                System.out.println("B1");
            }
            public B(String s){
                super(s.length());
                System.out.println("B2");
            }
        }

        public class Teste{
            public static void main(String[] args) {
                new B("abc");
            }
        }
    }

