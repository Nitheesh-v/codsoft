

import java.util.Scanner;
    class Atm_Machine
    {
        Scanner user=new Scanner(System.in);
        int pin,x;
        double deposit,withdraw;
        double dep=50000;
        double balance=20000;
        void password()
        {
            System.out.println(" Welcome!!");
            System.out.println(" Please Enter the pin number:");

            pin=user.nextInt();
        }
        void deposit()
        {
            if (withdraw>dep){
                System.out.println("Sorry 50000 is the daily limit for withdraw");
            }else{
                System.out.println("Amount deposited succesully");
            }

        }
        void withdraw()
        {
            if(withdraw>balance){
                System.out.println("insuffient balance");
            }else{
                System.out.println("withdraw succesfull");
            }
        }
        void checkbalance()
        {
            System.out.println("your available balance is:"+balance);
        }
    }
    class Bank_Account extends Atm_Machine
    {

        void operations()
        {
            while(true)
            {
                System.out.println();
                System.out.println("Enter  1 to deposit amount:");
                System.out.println("Enter  2 to withdraw amount:");
                System.out.println("Enter  3 to check balance:");
                System.out.println("Enter  4 to get receipt:");
                System.out.println("Enter  5 to exit:");
                x=user.nextInt();
                System.out.println();
                switch(x)
                {
                    case 1:
                    {
                        System.out.println("Enter  amount to deposit :");
                        deposit=user.nextDouble();
                        System.out.println("deposit completed");
                        balance=balance+deposit;
                        System.out.println("your balance:"+balance);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("Enter  amount to withdraw :");
                        withdraw=user.nextDouble();

                        if(withdraw<=balance) {
                            System.out.println("withdraw succesful");
                            balance=balance-withdraw;
                            System.out.println("balane:"+balance);

                        }

                        else
                        {
                            System.out.println("Insuffient balance");
                            System.out.println("Try again ");
                            break;
                        }

                        break;
                    }
                    case 3:
                    {
                        System.out.println("Your current balance is :"+balance);
                    }
                    break;
                    case 4:{
                        System.out.println("Welcome to TMB ATM:");
                        System.out.println("Your available balance:"+balance);
                        System.out.println("Amount deposited:"+deposit);
                        System.out.println("Amount withdrawed:"+withdraw);
                        System.out.println("Thanks You");

                        break;
                    }

                }


                if(x==5)
                {
                    System.out.println("Thank you have a great day!!!");
                    break;
                }

            }
        }
    }

    class Bank
    {
        public static void main(String[] args)
        {
            Atm_Machine obj=new Atm_Machine();
            Bank_Account obj1=new Bank_Account();
            obj.password();

            obj1.operations();

        }
    }
