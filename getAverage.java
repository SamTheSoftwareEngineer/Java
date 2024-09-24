// The ... means that this method can tke a variable number of values
public static double getAverage(double... values) {
    double sum = 0;
    int count = 0;

    for (double number : values) {
        sum += number;
        count++;
    }
    return sum / count;
    
}


public static void main(String[] args){
    double result = getAverage(1.1, 2.2, 3.3);
    System.out.println(result);

    double result2 = getAverage(18, 6, 21.3);
    System.out.println(result2);

    double result3 = getAverage(10.5, 21.5, 31.0);
    System.out.println(result3);
}

