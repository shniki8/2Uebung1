package again.p1;

public class Password implements Comparable<String>{
    String value;
    public Password(String value){
        this.value = value;
    }

    @Override
    public int compareTo(String o) {
        if (value.length() == o.length()){
            int countV = 0, countO = 0;
            for (int i = 0; i < value.length(); i++){
                if (Character.isDigit(value.charAt(i))){
                    countV++;
                }
                if (Character.isDigit(o.charAt(i))){
                    countO++;
                }
            }
            if (countV > countO) return 1;
            else return -1;
        }else{
            return value.compareTo(o);
        }
    }
}
