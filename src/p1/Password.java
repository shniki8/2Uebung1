package p1;

public class Password implements Comparable<String>{

    String value;
    public Password(String value){
        this.value = value;

    }

    public int compareTo(String s){

        if (value.length() > s.length()) return 1;
        else if(value.length() < s.length()) return -1;
        else {
            int countA = 0;
            int countB = 0;
            for (int i = 0; i < value.length(); i++) {
               if (Character.isDigit(value.charAt(i))){
                   countA++;
               }
            }
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))){
                    countB++;
                }
            }
            if (countA > countB) return 1;
            else if (countB > countA) return -1;
            else return 0;
        }


    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}