import java.util.Scanner;

public class readingInputFromUser {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);

        int sum=0;
        int counter=0;

        while(true){
            int order=counter+1;
            System.out.println("Enter number #"+order+":");
            boolean isInt=scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter==10){
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }
        System.out.println("Sum="+sum);
        scanner.close();


    }

}


