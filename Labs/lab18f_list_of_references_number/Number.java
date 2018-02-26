package lab18f_list_of_references_number;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Number {

    private Integer number;

    public Number() {
        number = 0;
    }

    public Number(int num) {
        number = num;
    }

    public void setNumber(int num) {
        number = num;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOdd() {
        if(number % 2 == 1){
            return true;
        }
        return false;
    }

    public boolean isPerfect() {
        int total = 0;
        for(int i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }
        return (number == total);
    }

    public String toString() {
        return "" + number;
    }
}