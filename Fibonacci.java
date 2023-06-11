import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci extends Thread {
    int length;
    int[] fib;
    
    public Fibonacci(int length) {
        this.length=length;
        fib=new int[length];
    }
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int length=scanner.nextInt();

        Fibonacci thread=new Fibonacci(length);
        thread.start();
        thread.join();
        System.out.println(Arrays.toString(thread.fib));
    }
    @Override
    public void run(){
        if(length>=1){
            fib[0]=0;
            if(length>=2){
                fib[1]=1;
            }
        }
        for(int i=2; i<length; i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
    }
}

