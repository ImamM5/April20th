public class Recursion
{
    public static void main(String [] args){
        System.out.println(lcm(10, 15));
        System.out.println(lcm(2, 8));
        System.out.println(lcm(7, 5));
        System.out.println(gcd(10, 15));
        System.out.println(gcd(81, 27));
        System.out.println(gcd(20, 45));
        System.out.println(toBinary(5));
        System.out.println(toBinary(7));
    }

    public static int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        else
        {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b)
    {
        return Math.abs(a*b)/gcd(a,b);
    }

    public static String toBinary(int n)
    {
        if (n==0)
        {
            return "";
        }
        else
        {
            return toBinary(n/2)+ (n%2);
        }
    }



}

