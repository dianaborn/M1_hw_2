import java.util.Random;

        public class generateRandomAge {
            public static void main(String[] args) {
                Random random = new Random();
                int test = random.nextInt(24);
                String rsa = generateRandomAge();
                System.out.println("Можно идти гулять!! " + "Ваш возраст: " + test + " лет");


                String areaar = Human(-20 - 30, 20 - 45);
                String area = Human(0 - 28, 30);
                String areas = Human(-10 - 25, 50);
                {
                    System.out.println("================");
                    System.out.println(areaar);
                    System.out.println(area);
                    System.out.println(areas);
                    System.out.println("------------");
                }

                {
                    System.out.println(areaar);
                    System.out.println(area);
                    System.out.println(areas);
                    System.out.println("**********");
                }
                {
                    System.out.println(areaar);
                    System.out.println(area);
                    System.out.println(areas);
                    System.out.println("+++++++++++");
                }
                {
                    System.out.println(areaar);
                    System.out.println(area);
                    System.out.println(areas);
                    System.out.println("^^^^^^^^^^^");
                }
                {
                    System.out.println(areaar);
                    System.out.println(area);
                    System.out.println(areas);
                }
            }

            public static String Human(int temperature, int age) {
                String area = " Можно идти гулять";
                String sar = "Оставайтесь дома";
                if (temperature == -20 - 30 && age == 20 - 45) {
                    return area;
                } else if (age > 20 && temperature == 0 - 28) {
                    return area;
                } else if (age > 45 && temperature == -10 - 25) {
                    return area;
                } else {
                    return sar;
                }
            }

            public static String generateRandomAge() {
                String rsa = "Можно идти гулять";
                Random random = new Random();
                int test = random.nextInt(21);
                return rsa;
            }


        }




