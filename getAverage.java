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
}

