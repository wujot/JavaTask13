import java.util.Scanner;

public class JavaTask13 {

    public static void main(String[] args) {

        int number;
        boolean condition = false;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Type a number: ");
            number = sc.nextInt();
            switch (checkCondition(number)) {
                case 1:
                    condition = true;
                    System.out.println("Given number is too small.");
                    break;
                case 2:
                    condition = true;
                    System.out.println("Given number is too large.");
                    break;
                case 3:
                    condition = true;
                    System.out.println("Given number is not divided by 3.");
                    break;
                case 4:
                    condition = false;
                    System.out.println("Given number is correct.");
                    break;
            }
        } while(condition == true);

        sc.close();
    }

    public static int checkCondition(int number) {
        if(number < 100) {
            return 1;
            //System.out.println("Given number is too small.");
        }else if(number > 200) {
            return 2;
            //System.out.println("Given number is too large.");
        }else if(!(number % 3 == 0)) {
            return  3;
            //System.out.println("Given number is not divided by 3.");
        }else
            return 4;
            //System.out.println("Given number is correct.");
    }
}
