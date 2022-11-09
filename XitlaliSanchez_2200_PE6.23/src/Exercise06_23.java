/*********
 * 
 * @author Xitlali Sanchez
 * Date: 11/9/2022 [W]
 * push to github 11/9/2022
 *
 */

import java.util.Scanner;

public class Exercise06_23 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.println("The number of occurrences of \'" + ch +"\' in \"" + s + "\" is " + count(s,ch));
   
        input.close();
    }

    public static int count(String str, char a) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == a) count++;
        }

        return count;
        
    }
}