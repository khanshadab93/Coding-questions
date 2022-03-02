
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class ValidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        ArrayList<String> input = new ArrayList<>();
        String i="";
        System.out.println("Enter elements of array");
        while (n!=0) {
            i = sc.next();
            input.add(i);
            n--;
        }
        for(int j=input.size()-1;j>=0;j--) {
            try {
                Double.parseDouble(input.get(j));
                System.out.println("index ="+j+" and number ="+input.get(j));
            }
            catch(Exception e) {
                continue;
            }
        }
    }
}