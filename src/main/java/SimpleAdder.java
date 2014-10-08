/**
 * Created by Przemo on 2014-10-06.
 */
public class SimpleAdder {
    public String add(String equation) {
        String [] equationArray=equation.split(",|" + System.getProperty("line.separator"));
        Integer value=0;
            for (String number : equationArray) {
                if(number.isEmpty()){
                    number="0";
                }
                value=value + Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
            }
    return value.toString();
    }
}
