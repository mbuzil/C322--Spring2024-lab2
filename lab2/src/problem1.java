public class problem1 {
    public static void main(String args[])
    {
        System.out.println(findPrime(17));
        System.out.println(findPrime(465));
        System.out.println(findPrime(7919));
        System.out.println(findPrime(10000));
    }
    public static boolean findPrime(int n)
    {
        boolean isNotPrime = false;
        for(int i = 2; i < n; i++)
        {
            if(n%i == 0)
            {
                isNotPrime = true;
            }
        }
        return(!isNotPrime);
    }
}
