import java.io.DataInputStream;
import java.util.Scanner;
public class bank0 {
    DataInputStream input = new DataInputStream(System.in);
    Scanner in = new Scanner (System.in);
    int aoc;
    String name = new String();
    String aot = new String();
    float bal;
    public bank0()
    {
        name=" ";
        aot=" ";
        bal=0.0f;
        aoc=0;
    }
        public void create()
        {
            try {
                System.out.println("Enter Name = ");
                name = input.readLine();
                aoc++;
                System.out.println("Enter Type of Account = ");
                aot =  input.readLine();
                System.out.println("Enter Balance = ");
                bal = in.nextInt();
            }
            catch(Exception e)
            {

            }
        }
    public void deposit()
    {
        int a;
        System.out.println("Enter Account Number =");
        a=in.nextInt();
        if(a==aoc)
        {
            float b;
            System.out.println("Enter Amount to be deposit = ");
            b=in.nextFloat();
            bal=bal+b;
            System.out.println("Total Balance = "+bal);
        }
        else
        {
            System.out.println("Invalid Input.");
        }
    }
    public void withdraw()
    {
        int a;
        System.out.println("Enter Account Number = ");
        a=in.nextInt();
        if(a==aoc)
        {
            float b;
            System.out.println("Enter Amount to be Withdraw = ");
            b=in.nextFloat();
            if(b<bal)
            {
                bal=bal-b;
                System.out.println("Total Balance = "+bal);
            }
            else if(b>bal)
            {
                System.out.println("Not Enough Balance.");
            }
            else
            {
                System.out.println("Invalid Input.");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
    public void show()
    {
        System.out.println("Customer Name = "+name);
        System.out.println("Account Number = "+aoc);
        System.out.println("Type of Account = "+aot);
        System.out.println("Total Balance = "+bal);
    }
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        DataInputStream input = new DataInputStream(System.in);
        try {
            int ch;
            bank0 c = new bank0();
            String ans = new String();
            x:do {
                System.out.println("1.Create Account\n2.Deposit Amount\n3.Withdrawal Amount\n4.Display Details\n5.Exit");
                System.out.println("Enter Choice = ");
                ch = in.nextInt();
                switch (ch) {
                    case 1:
                        c.create();
                        break;
                    case 2:
                        c.deposit();
                        break;
                    case 3:
                        c.withdraw();
                        break;
                    case 4:
                        c.show();
                        break;
                    case 5:
                        break x;
                    default:
                        System.out.println("Invalid Input.");
                }
                System.out.println("To Continue(yes/no) = ");
                ans=input.readLine();
            } while (ans.equalsIgnoreCase("yes"));
        }
        catch(Exception e)
        {

        }
    }
}
