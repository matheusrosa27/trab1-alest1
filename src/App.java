public class App {
    public static void main(String[] args) throws Exception {        
        
        /*/ EXPONENCIAL
        double r = (Math.log(1499850814) - Math.log(28148)) / (Math.log(95) - Math.log(10));
        double b = Math.exp(r);
        
        for (int i = 0; i<=100; i+=5) {
            double s = Math.log(alg5(i)) / i*b;
            String y = String.format("%.2f", r*i+s);
            System.out.println(i+" ; "+y);
        }

        

        // POLINOMIAL
        /*
        double b = (Math.log(10710) - Math.log(30)) / (Math.log(35) - Math.log(5));

        for (int i = 0; i<=100; i+=5) {
            System.out.println(Math.log(Math.exp(i))+" ; "+String.format("%.2f", i*b));
        }
        */
        // System.out.println("log(f(e^n)) = log(n^b)");
        
        // System.out.println("b = "+b);


        // executar algoritmo
        for (int i=0; i<=150; i+=5) {
            System.out.println(i+" ; "+alg5(i));
        }
        
        
    }

    public static int alg1(int n){
        int cont_ops = 0;
        int res = 0;

        for (int i = n; i <= n+1; i+=1) {
            for (int j = n+1; j <= n+i; j+=i) {
                for (int k = 1; k <= i*i; k += i/2+1) {
                    res = res + i;
                    cont_ops++;
                }
            }
        }

        return cont_ops;
    }

    public static int alg2(int n) {
        int cont_ops = 0;
        int res = 0;

        for (int i = n; i <= n+1; i+=2) {
            for (int j = n+1; j <= n*n; j+=2) {
                for (int k = i+1; k <= 2*n; k+=2) {
                    res = res + n*k;
                    cont_ops++;
                }
            }
        }

        return cont_ops;
    }

    public static int alg3(int n) {
        int cont_ops = 0;
        int res = 0;

        for (int i = n+1; i <= n+1; i+=1) {
            for (int j = n; j <= i+1; j+=j/2+1) {
                for (int k = j; k <= n*j; k += Math.abs(j-i)+1) {
                    res = res + n*k;
                    cont_ops++;
                }
            }
        }

        return cont_ops;
    }

    public static int alg4(int n) {
        int cont_ops = 0;
        int res = 0;

        for (int i = n/2; i <= n*n; i+=1) {
            for (int j = 1; j <= n*n; j+=i/2+1) {
                for (int k = 2; k <= i*j; k += j/2+1) {
                    res = res + n-1;
                    cont_ops++;
                }
            }
        }

        return cont_ops;
    }

    public static long alg5(int n) {
        long cont_ops = 0;
        long res = 0;

        for (int i = n/2; i <= n+1; i+=2) {
            for (int j = i; j <= n*i; j+=i/2+1) {
                for (int k = i+1; k <= n*j; k += 1) {
                    res = res + k*j;
                    cont_ops++;
                }
            }
        }

        return cont_ops;
    }
}
