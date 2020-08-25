public class SILab2 {
        public static void main(String[] args) {
            checkPrime(8);
        }
        static boolean checkPrime(int n) {
            if (n < 0)//A
                 {
                throw new RuntimeException("Number should not be negative");//B
            }
            int m = n / 2;//C
            if (n == 0 || n == 1)//C
                 {
                return false;//D
            } else //E
                 {
                for (int i = 2;//F
                     i <= m;//G
                     i++)//H
                     {
                    if (n % i == 0)//I
                         {
                        return true;//J
                    }

                }
                return false;//K
            }
        }

}
