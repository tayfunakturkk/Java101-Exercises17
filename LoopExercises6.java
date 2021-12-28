package Loops.Exercises6;
import java.util.Scanner;
public class LoopExercises6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int number=input.nextInt();
        int stepValue,result=0;        
        while(number!=0){
            stepValue=number%10;
            System.out.println(stepValue);
            number/=10;  
            result+=stepValue;
           
        }
        
        System.out.println("Yazılan sayının rakamları toplamı:"+result);
        



        
        
        
        

    }
    
}
