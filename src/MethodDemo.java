public class MethodDemo {

    public static String buildWeatherText(String weather, String smile) {
        String result= "Today is " + weather + " " + smile;
        return result;
    }





    public static void main(String[] args) {
        String output = buildWeatherText("sunny", ":-D");
        System.out.println(output);
        System.out.println(buildWeatherText("lockdowny", "DINKLEBERG"));

    }


}
