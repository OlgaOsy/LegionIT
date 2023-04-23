package lesson4;

public class Lesson3Homework {

        public static void main(String[] args) {
            Lesson3Homework lesson3Homework = new Lesson3Homework();
            lesson3Homework.compareStrings ( "catalogy", "cat" );
            System.out.println(lesson3Homework.isPalindrome("mam"));
        }


        public void compareStrings(String a, String b){
            if (a == null || b == null) {
                System.out.println("Cannot compare Strings");
            } else if (a.equals(b) && b.equals(a)) {
                System.out.println("The Strings are the same");
            } else if (a.contains(b)) {
                System.out.println(b + " is the part of " + a);
            } else {
                System.out.println("Eror!");
            }}

            public boolean isPalindrome(String text1){
                String text2 = "";
                int lastletter = text1.length()-1;
                for (int i = lastletter; i >= 0; i--){
                    text2 = text2 + text1.charAt(i);
                }
                if (text1.equals(text2)){
                    return true;
                }
                else{
                    return false;
            }

        }}
