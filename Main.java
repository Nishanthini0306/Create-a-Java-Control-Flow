import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        else if(a<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
   //switch case     
        int num=sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
                case 2:
                System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wednesday");
                break;
                case 5:
                System.out.println("Thursday");
                break;
                case 6:
                System.out.println("Friday");
                break;
                case 7:
                System.out.println("Saturday");
                break;
        
            default:
            System.out.println("Invalid");
                break;
        }
      
//while loop 
	    
int n1=5;
while(n1>0){
    
    System.out.print(n1+" ");
    n1--;
}
System.out.print("\n");

//do while loop

int n2=1;
do{
    System.out.print(n2+" ");
    n2++;
}
while(n2<=3);   
      
        sc.close();
    }
}
