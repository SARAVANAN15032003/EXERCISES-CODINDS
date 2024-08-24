import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num=scanner.nextLong();
        long h=squareNumber(num);//144 sq
        long u=reverse(num);//21
        long t=squareNumber(u);//441
        long p=reverse(t);//144
        if(h==p)
        System.out.print("Adam Number");
        else
        System.out.print("Not Adam");    
    }
    public static long reverse(long num) {
        long revNum = 0;
        while (num != 0) {
            long digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        return revNum;
    }
    public static long squareNumber(long num) {
        return num * num;
    }
}
