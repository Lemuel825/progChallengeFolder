import java.util.Scanner;
public class Task10CheckConsonantAndVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter a string: ");
        while(true) {
            String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase

            int vowels = 0, consonants = 0;

            for (char ch : input.toCharArray())
                {
                    if (Character.isLetter(ch))  // Check if character is a letter
                        {
                            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                                {
                                    vowels++;
                                }
                            else
                                {
                                    consonants++;
                                }
                        }
                    else
                        {
                            System.out.print("Invalid Input! Please Input Only Letters: ");
                            flag = false;
                        }
                }
            if (flag)
                {
                    System.out.println("Number of vowels: " + vowels);
                    System.out.println("Number of consonants: " + consonants);
                    break;
                }
            flag = true;
        }

    }
}
