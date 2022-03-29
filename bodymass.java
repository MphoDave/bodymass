import java.util.Scanner;
public class bodymass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height");
        double height = sc.nextDouble();

        System.out.println("Enter your weight");
        double weight = sc.nextDouble();

        double BMI = weight/(height*height);

        if ( BMI < 18.5){

            System.out.println("Your Body Mass is " +Math.round(BMI*100.0)/100.0+ " this is considered as under weight");


        } else if ( BMI >= 18.5 && BMI < 25){

            System.out.println("Your Body Mass is " +Math.round(BMI*100.0)/100.0+" this is considered as healthy");

        } else if ( BMI > 25 && BMI <= 30){

            System.out.println("Your Body Mass is " +Math.round(BMI*100.0)/100.0+" this is considered as over weight");

        } else {

            System.out.println("Your Body Mass is " +Math.round(BMI*100.0)/100.0+" this is considered as obese");


        }

        
        
    }
    












}
