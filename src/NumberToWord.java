import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int Number = sc.nextInt();
        int Row_Unit = Number % 10;
        int Row_Teen = Number % 100;
        int Row_Ty = (Number - Row_Unit) % 100;
        int Row_Hundred = Number - Row_Teen;
        String Name_Row_Unit;
        String Name_Row_Teen;
        String Name_Row_Ty;
        String Name_Row_Hundred;
        switch (Row_Unit) {
            case 1:
                Name_Row_Unit = "one";
                break;
            case 2:
                Name_Row_Unit = "two";
                break;
            case 3:
                Name_Row_Unit = "three";
                break;
            case 4:
                Name_Row_Unit = "four";
                break;
            case 5:
                Name_Row_Unit = "five";
                break;
            case 6:
                Name_Row_Unit = "six";
                break;
            case 7:
                Name_Row_Unit = "seven";
                break;
            case 8:
                Name_Row_Unit = "eight";
                break;
            case 9:
                Name_Row_Unit = "nine";
                break;
            default:
                Name_Row_Unit = " ";

        }

        switch (Row_Teen) {
            case 10:
                Name_Row_Teen = "ten";
                break;
            case 11:
                Name_Row_Teen = "eleven";
                break;
            case 12:
                Name_Row_Teen = "twelve";
                break;
            case 13:
                Name_Row_Teen = "thirteen";
                break;
            case 14:
                Name_Row_Teen = "fourteen";
                break;
            case 15:
                Name_Row_Teen = "fitteen";
                break;
            case 16:
                Name_Row_Teen = "sixteen";
                break;
            case 17:
                Name_Row_Teen = "seventeen";
                break;
            case 18:
                Name_Row_Teen = "eighteen";
                break;
            case 19:
                Name_Row_Teen = "nineteen";
                break;

            default:
                Name_Row_Teen = " ";
        }
        switch (Row_Ty) {
            case 20:
                Name_Row_Ty = "twenty";
                break;
            case 30:
                Name_Row_Ty = "thirty";
                break;
            case 40:
                Name_Row_Ty = "fourty";
                break;
            case 50:
                Name_Row_Ty = "fitty";
                break;
            case 60:
                Name_Row_Ty = "sixty";
                break;
            case 70:
                Name_Row_Ty = "seventy";
                break;
            case 80:
                Name_Row_Ty = "eighty";
                break;
            case 90:
                Name_Row_Ty = "ninety";
                break;
            default:
                Name_Row_Ty = " ";
        }
        switch (Row_Hundred) {
            case 100:
                Name_Row_Hundred = "one Hundred";
                break;
            case 200:
                Name_Row_Hundred = "two Hundred";
                break;
            case 300:
                Name_Row_Hundred = "three Hundred";
                break;
            case 400:
                Name_Row_Hundred = "four Hundred";
                break;
            case 500:
                Name_Row_Hundred = "five Hundred";
                break;
            case 600:
                Name_Row_Hundred = "six Hundred";
                break;
            case 700:
                Name_Row_Hundred = "seven Hundred";
                break;
            case 800:
                Name_Row_Hundred = "eight Hundred";
                break;
            case 900:
                Name_Row_Hundred = "night Hundred";
                break;
            default:
                Name_Row_Hundred = " ";
        }
        if (Number == 0) {
            System.out.println(Number + " :Read: zero");
        } else if (Number > 0 && Number < 10) {
            System.out.println(Number + " Read: " + Name_Row_Unit);
        } else if (Number < 20) {
            System.out.println(Number + " :Read: " + Name_Row_Teen);
        } else if (Number < 100) {
            System.out.println(Number + " :Read: " + Name_Row_Ty + Name_Row_Unit);
        } else if (Number < 1000 && Row_Teen < 10) {
            System.out.println(Number + " :Read: " + Name_Row_Hundred + " " + Name_Row_Unit);
        } else if (Number < 1000 && Row_Teen < 20) {
            System.out.println(Number + " :Read: " + Name_Row_Hundred + " " + Name_Row_Teen);
        } else if (Number < 1000 && Row_Teen < 100) {
            System.out.println(Number + " :Read: " + Name_Row_Hundred + " " + Name_Row_Ty + "-" + Name_Row_Unit);
        }
    }

}
