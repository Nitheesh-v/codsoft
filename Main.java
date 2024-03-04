
    import java.util.Scanner;

     class Number_Game {
        int think;
        int i;
        int chances=9;
        void guessNumGame() {

            System.out.println("          "+"----Instructions to play game----");
            System.out.println("Step1:You have to Choose the number between 1 to 100");
            System.out.println("Step2:You have to find the correct number");
            System.out.println("Step3:Totally you have 9 chances");
            System.out.println("Step4:Within 9 chances you have to find the hided number");
            System.out.println("Let's play and enjoy!");
            int hided_number=(int)(Math.random()*100);
            for(i=0;i<chances;i++) {
                System.out.println("Think and Enter the number:");
                Scanner user=new Scanner(System.in);
                think=user.nextInt();
                if(hided_number==think) {
                    System.out.println("Wow!! You have entered the correct number");
                    System.out.println("Congratulations!! You have won the game");
                    break;

                }
                else if(hided_number<think) {
                    System.out.println("The hided_number is less than:"+think);
                }
                else if(hided_number>think) {
                    System.out.println("The hided_number is greater than:"+think);
                }
            }
            if(i==chances) {
                System.out.println("Sorry!Your chances are finished");
                System.out.println("the correct number is :"+hided_number);
                System.out.println("Better luck next time");

            }
        }
    }
    class Main{
        public static void main(String[] args) {
            Number_Game obj=new Number_Game();
            obj.guessNumGame();
        }
    }


